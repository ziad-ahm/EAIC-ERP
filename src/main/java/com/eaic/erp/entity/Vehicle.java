package com.eaic.erp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_variant_id", nullable = false)
    private VehicleVariant vehicleVariant;

    @Column(name = "current_km")
    private BigDecimal currentKm;

    @Column(name = "vin_number")
    private String vinNumber;

    @Column(name = "plate_number")
    private String plateNumber;

    @Column(name = "engine_number")
    private String engineNumber;

    private String color;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
