package com.eaic.erp.entity.inventory;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {

    @EmbeddedId
    private InventoryId id;

    @JoinColumn(name = "warehouse_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("warehouseId")
    private Warehouse warehouse;

    @JoinColumn(name = "part_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("partId")
    private Part part;

    @Column(nullable = false)
    private BigDecimal quantity;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
