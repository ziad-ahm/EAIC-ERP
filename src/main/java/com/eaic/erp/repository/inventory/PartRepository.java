package com.eaic.erp.repository.inventory;

import com.eaic.erp.entity.inventory.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Long> {
}
