package com.org.inventorymanagement.Repositories;

import com.org.inventorymanagement.Entities.Currency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    Page<Currency> findAll(Pageable pageable);
}
