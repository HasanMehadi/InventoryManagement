package com.org.inventorymanagement.Controllers;


import com.org.inventorymanagement.Configurations.Response;
import com.org.inventorymanagement.Entities.Brand;
import com.org.inventorymanagement.Models.BrandDTO;
import com.org.inventorymanagement.Services.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/brand")
public class BrandController {

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
    public ResponseEntity<BrandDTO> getBrand(@RequestBody long id) {

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
            return new ResponseEntity<BrandDTO>(brandDTO, HttpStatus.OK);

        }

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete")
    public  ResponseEntity<Response> delete(@RequestBody long id){

        System.out.println("Brand delete controller called");

        try{
              boolean b = brandService.delete(id);

              if(b){
                  return new ResponseEntity<Response>(new Response("Brand Delete Successfully"),HttpStatus.OK);
              }else {
                  return new ResponseEntity<Response>(new Response("No Brand Delete"),HttpStatus.OK);
              }
        }catch (Exception ex){

            System.out.println(ex.getCause().getMessage());

            return new ResponseEntity<Response>(new Response("Unable to delete Brand"),HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


}
