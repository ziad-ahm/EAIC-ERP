package com.eaic.erp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "services")
@Getter
@Setter
@NoArgsConstructor
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(name = "default_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal defaultPrice;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;
}