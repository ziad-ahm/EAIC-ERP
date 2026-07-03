package com.eaic.erp.repository.inventory;

import com.eaic.erp.entity.inventory.PartVehicleVariant;
import com.eaic.erp.entity.inventory.PartVehicleVariantId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartVehicleVariantRepository extends JpaRepository<PartVehicleVariant, PartVehicleVariantId> {
}
