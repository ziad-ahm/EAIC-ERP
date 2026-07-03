package com.eaic.erp.entity;

import com.eaic.erp.entity.inventory.Part;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "part_request_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartRequestItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "part_request_id", nullable = false)
    private PartRequest partRequest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "part_id", nullable = false)
    private Part part;

    @Column(name = "requested_qty", precision = 12, scale = 2, nullable = false)
    private BigDecimal requestedQty;

    @Column(columnDefinition = "TEXT")
    private String notes;
}