package com.org.inventorymanagement.Controllers;


import com.org.inventorymanagement.Configurations.Response;
import com.org.inventorymanagement.Entities.Brand;
import com.org.inventorymanagement.Models.BrandDTO;
import com.org.inventorymanagement.Services.BrandService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/brand")
public class BrandController {

    private final Logger log = LoggerFactory.getLogger(BrandController.class);

    @Autowired
    private BrandService brandService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/save")
    public ResponseEntity<BrandDTO> save(@RequestBody BrandDTO brandDTO) {

        ModelMapper modelMapper = new ModelMapper();
        Brand brand = modelMapper.map(brandDTO, Brand.class);

        System.out.println("Brand Add controller called");
        try {

            brandDTO = modelMapper.map(brandService.save(brand), BrandDTO.class);
            return new ResponseEntity<BrandDTO>(brandDTO, HttpStatus.OK);
        } catch (Exception ex) {

            System.out.println(ex.getCause().getMessage());
            brandDTO = new BrandDTO();
            brandDTO.setErrorCode(404);
            brandDTO.setErrorMsg("Brand not Saved");
            return new ResponseEntity<BrandDTO>(brandDTO, HttpStatus.OK);

        }

    }

    @GetMapping("/get")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<BrandDTO> getBrand(@RequestParam long id) {

        System.out.println("Brand Get Item Called");

        BrandDTO brandDTO = null;

        ModelMapper modelMapper = new ModelMapper();

        try {

            Brand brand = brandService.getBrandById(id);
            brandDTO = modelMapper.map(brand, BrandDTO.class);

            if (brand != null) {
                return new ResponseEntity<BrandDTO>(brandDTO, HttpStatus.OK);
            }

        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            brandDTO = new BrandDTO();
            brandDTO.setErrorCode(404);
            brandDTO.setErrorMsg("No Brand Found");
            return new ResponseEntity<BrandDTO>(brandDTO, HttpStatus.BAD_REQUEST);
        }

        return null;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<BrandDTO> update(@RequestBody BrandDTO brandDTO) {

        System.out.println("Brand update controller called");
        try {

            ModelMapper modelMapper = new ModelMapper();
            Brand brand = modelMapper.map(brandDTO, Brand.class);
            brandDTO = modelMapper.map(brandService.update(brand), BrandDTO.class);
            return new ResponseEntity<BrandDTO>(brandDTO, HttpStatus.OK);
        } catch (Exception ex) {


            brandDTO = new BrandDTO();
            brandDTO.setErrorCode(404);
            brandDTO.setErrorMsg("Brand not Saved");
            return new ResponseEntity<BrandDTO>(brandDTO, HttpStatus.BAD_REQUEST);

        }

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete")
    public ResponseEntity<Response> delete(@RequestBody long id) {

        System.out.println("Brand delete controller called");

        try {
            boolean b = brandService.delete(id);

            if (b) {
                return new ResponseEntity<Response>(new Response("Brand Delete Successfully"), HttpStatus.OK);
            } else {
                return new ResponseEntity<Response>(new Response("No Brand Delete"), HttpStatus.OK);
            }
        } catch (Exception ex) {

            System.out.println(ex.getCause().getMessage());
            return new ResponseEntity<Response>(new Response("Unable to delete Brand"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/gets")
    public ResponseEntity<Page<BrandDTO>> showPage(Pageable pageable) {

        System.out.println("Brand Pageable Called");
        try {
            log.debug("Inside try");
            return new ResponseEntity<Page<BrandDTO>>(brandService.findPage(pageable), HttpStatus.OK);
        } catch (Exception ex) {
            log.debug(ex.getMessage());
            return ResponseEntity.notFound().header(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()).build();
        }

    }


}
