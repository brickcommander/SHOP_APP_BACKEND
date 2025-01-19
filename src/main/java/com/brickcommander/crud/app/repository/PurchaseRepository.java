package com.brickcommander.crud.app.repository;

import com.brickcommander.crud.app.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    Purchase findOneByPurchaseId(Long purchaseId);
}
