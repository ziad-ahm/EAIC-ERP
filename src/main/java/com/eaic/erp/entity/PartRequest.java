package com.eaic.erp.entity;

import com.eaic.erp.enums.PartRequestStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "part_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_order_id", nullable = false)
    private JobOrder jobOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requested_by_technician_id", nullable = false)
    private Technician requestedByTechnician;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approved_by_user_id")
    private User approvedByUser;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PartRequestStatus status;

    @Column(name = "requested_at", insertable = false, updatable = false)
    private LocalDateTime requestedAt;

    @Column(name = "approved_at")
    private LocalDateTime approvedAt;
}