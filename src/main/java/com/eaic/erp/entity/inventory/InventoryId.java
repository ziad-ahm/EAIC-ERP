package com.eaic.erp.entity.inventory;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class InventoryId implements Serializable {

    @Column(name = "warehouse_id")
    private Long warehouseId;

    @Column(name = "part_id")
    private Long partId;

}
