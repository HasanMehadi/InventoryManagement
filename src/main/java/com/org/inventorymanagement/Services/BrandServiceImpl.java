package com.org.inventorymanagement.Services;

import com.org.inventorymanagement.Entities.Brand;
import com.org.inventorymanagement.Repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand save(Brand brand){

        try{
            return brandRepository.save(brand);
        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }

        return null;
    }

    @Override
    public List<Brand> findAll() {

        try{
            return brandRepository.findAll();

        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }
        return null;
    }

    @Override
    public Brand getBrandById(long id) {

        Brand brand = null;

        try{
            brand = brandRepository.getOne(id);
            if(brand == null){
                return null;
            }
        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }
        return brand;
    }

    @Override
    public Brand update(Brand brand) {
        try{

            brand = brandRepository.save(brand);

            if( brand != null){
                return brand;
            }
        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
            return null;
        }

        return null;
    }

    @Override
    public Boolean delete(long id) {
        try{

            brandRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
            return false;
        }
    }

}
