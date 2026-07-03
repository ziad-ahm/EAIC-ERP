package com.eaic.erp.repository.inventory;

import com.eaic.erp.entity.inventory.Inventory;
import com.eaic.erp.entity.inventory.InventoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, InventoryId> {
}
