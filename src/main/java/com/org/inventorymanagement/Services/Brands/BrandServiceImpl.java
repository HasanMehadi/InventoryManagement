package com.org.inventorymanagement.Services.Brands;

import com.org.inventorymanagement.Configurations.ModelEntityConversionUtil;
import com.org.inventorymanagement.Entities.Brand;
import com.org.inventorymanagement.Models.BrandDTO;
import com.org.inventorymanagement.Repositories.BrandRepository;
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

public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    @Cacheable(value = "brands", key = "#brand.brandId",unless = "#result== null")
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public BrandDTO save(BrandDTO brandDTO) {

        try {

            Brand brand = ModelEntityConversionUtil.convert(brandDTO,Brand.class);
            return ModelEntityConversionUtil.convert(brandRepository.save(brand),BrandDTO.class);
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
    @Cacheable(value = "brands", key = "#brandDTO.brandId")
    @Transactional(rollbackFor = Exception.class, timeout = 5000, readOnly = true)
    public BrandDTO getBrandById(BrandDTO brandDTO) {


        try {
            //Brand brand = ModelEntityConversionUtil.convert(brandDTO,Brand.class);
//            brand = brandRepository.getOne(id);
//            if (brand == null) {
//                return null;
//            }
            return ModelEntityConversionUtil.convert(brandRepository.getOne(brandDTO.getBrandId()),BrandDTO.class);
        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            return null;
        }
    }

    @Override
    @CachePut(value = "inventoryManagement", key = "#brandDTO.brandId", unless = "#result== null")
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public BrandDTO update(BrandDTO brandDTO) {
        try {
            return ModelEntityConversionUtil.convert(brandRepository.save(ModelEntityConversionUtil.convert(brandDTO, Brand.class)),BrandDTO.class);
        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            return null;
        }

    }

    @Override
    @CacheEvict(value = "brands",key = "#brandDTO.brandId", allEntries=true)
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public Boolean delete(BrandDTO brandDTO) {
        try {
            brandRepository.deleteById(brandDTO.getBrandId());
            return true;

        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            return false;
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 5000, readOnly = true)
    public Page<BrandDTO> findPage(Pageable pageable) {
        try{
            System.out.println("Cache Not Called");
            Page<Brand> brandPage = brandRepository.findAll(pageable);

            return ModelEntityConversionUtil.convertPage(brandPage, BrandDTO.class);

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
