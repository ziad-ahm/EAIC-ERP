package com.eaic.erp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "branches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    @Id
    private Integer id;

    private String name;
    private String address;
    private String phone;
    @Column(name = "branch_code")
    private String branchCode;
}
