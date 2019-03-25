package com.org.inventorymanagement.Repositories;

import com.org.inventorymanagement.Entities.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

    Page<Brand> findAll(Pageable pageable);
}
