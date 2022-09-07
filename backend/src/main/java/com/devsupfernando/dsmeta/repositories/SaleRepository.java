package com.devsupfernando.dsmeta.repositories;

import com.devsupfernando.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
