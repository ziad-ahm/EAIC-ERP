package com.eaic.erp.repository.inventory;

import com.eaic.erp.entity.inventory.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
