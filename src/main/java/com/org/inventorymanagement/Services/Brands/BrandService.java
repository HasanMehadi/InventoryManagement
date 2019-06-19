package com.org.inventorymanagement.Services.Brands;

import com.org.inventorymanagement.Entities.Brand;
import com.org.inventorymanagement.Models.BrandDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BrandService {

    public BrandDTO save(BrandDTO brandDTO);
    //public List<Brand> findAll();
    public BrandDTO getBrandById(BrandDTO brandDTO);
    public BrandDTO update(BrandDTO brandDTO);
    public Boolean delete(BrandDTO brandDTO);
    public Page<BrandDTO> findPage(Pageable pageable);
}
