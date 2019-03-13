package com.org.inventorymanagement.Services;

import com.org.inventorymanagement.Entities.Brand;

import java.util.List;

public interface BrandService {

    public Brand save(Brand brand);
    public List<Brand> findAll();
    public Brand getBrandById(long id);
    public Brand update(Brand brand);
    public Boolean delete(long id);
}
