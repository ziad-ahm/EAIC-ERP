package com.eaic.erp.entity.inventory;

import jakarta.persistence.Column;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PartVehicleVariantId implements Serializable {

    @Column(name = "part_id")
    private Long partId;

    @Column(name = "vehicle_variant_id")
    private Integer vehicleVariantId;
}