package com.eaic.erp.repository;

import com.eaic.erp.entity.JobOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOrderRepository extends JpaRepository<JobOrder, Integer> {
}
