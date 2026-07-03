package com.eaic.erp.entity.inventory;

import com.eaic.erp.entity.VehicleVariant;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "part_vehicle_variants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartVehicleVariant {

    @EmbeddedId
    private PartVehicleVariantId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("partId")
    @JoinColumn(name = "part_id")
    private Part part;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("vehicleVariantId")
    @JoinColumn(name = "vehicle_variant_id")
    private VehicleVariant vehicleVariant;
}