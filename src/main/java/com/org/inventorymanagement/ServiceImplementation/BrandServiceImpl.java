package com.org.inventorymanagement.ServiceImplementation;

import com.org.inventorymanagement.Configurations.ModelEntityConversionUtil;
import com.org.inventorymanagement.Entities.Brand;
import com.org.inventorymanagement.Models.BrandDTO;
import com.org.inventorymanagement.Repositories.BrandRepository;
import com.org.inventorymanagement.Services.BrandService;
import com.org.inventorymanagement.Services.PaginationUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    @Cacheable(value = "inventoryManagement", key = "#brand")
    public Brand save(Brand brand) {

        try {
            return brandRepository.save(brand);
        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
        }

        return null;
    }

    /*@Override
    public List<Brand> findAll() {

        try{
            return brandRepository.findAll();

        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }
        return null;
    }*/

    @Override
    @Cacheable(value = "inventoryManagement", key = "#id")
    public Brand getBrandById(long id) {

        Brand brand = null;

        try {
            brand = brandRepository.getOne(id);
            if (brand == null) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
        }
        return brand;
    }

    @Override
    @CachePut(value = "inventoryManagement", key = "#brand")
    public Brand update(Brand brand) {
        try {

            brand = brandRepository.save(brand);

            if (brand != null) {
                return brand;
            }
        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            return null;
        }

        return null;
    }

    @Override
    @CacheEvict(value = "inventoryManagement", key = "#id")
    public Boolean delete(long id) {
        try {

            brandRepository.deleteById(id);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            return false;
        }
    }

    @Override
    @Cacheable(value = "inventoryManagement", key = "#pageable")
    public Page<BrandDTO> findPage(Pageable pageable) {
        try{
            Page<Brand> brandPage = brandRepository.findAll(pageable);

            Page<BrandDTO> brandDTOS = ModelEntityConversionUtil.convertPage(brandPage, BrandDTO.class);

            return brandDTOS;

        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }

        return null;
    }

//    @Override
//    public Page<BrandDTO> findPage(int pageValue, int maxElement) {
//        try {
//
//            ModelMapper modelMapper = new ModelMapper();
//            Page<Brand> page = brandRepository.findAll(PageRequest.of(pageValue, maxElement));
////
////            Page<BrandDTO> brandDTOPage = modelMapper.map(page,BrandDTO.class);
//
//            return
//        } catch (Exception ex) {
//            System.out.println(ex.getCause().getMessage());
//        }
//
//        return null;
//    }


    public ResponseEntity<List<Brand>> findByPageAble(Pageable pageable) {
        Page<Brand> brandPage = brandRepository.findAll(pageable);
        ModelMapper modelMapper = new ModelMapper();
//        Page<BrandDTO> brandDTOPage =
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(brandPage, "/api/brand/pageable");
        return new ResponseEntity<>(brandPage.getContent(), headers, HttpStatus.OK);
    }

//    public Page<BrandDTO> brandDTOPage(Page<Brand> brandPage) {
//        ModelMapper modelMapper = new ModelMapper();
//        Page<BrandDTO> brandDTOPage = brandPage.map(new Converter<Brand, BrandDTO>() {
//            @Override
//            public BrandDTO convert(Brand source) {
//                return null;
//            }
//        });
//    }


}
