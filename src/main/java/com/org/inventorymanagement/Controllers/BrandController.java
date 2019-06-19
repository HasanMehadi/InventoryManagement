package com.org.inventorymanagement.Controllers;


import com.org.inventorymanagement.Configurations.Response;
import com.org.inventorymanagement.Models.BrandDTO;
import com.org.inventorymanagement.Services.Brands.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/save")
    public ResponseEntity<BrandDTO> save(@RequestBody final BrandDTO brandDTO) {

       /* ModelMapper modelMapper = new ModelMapper();
        Brand brand = modelMapper.map(brandDTO, Brand.class);*/

        //System.out.println("Brand Add controller called");
        try {

            BrandDTO DTO = brandService.save(brandDTO);
            return new ResponseEntity<>(DTO, HttpStatus.OK);
        } catch (Exception ex) {

            System.out.println(ex.getCause().getMessage());
            BrandDTO DTO = new BrandDTO();
            DTO.setErrorCode(404);
            DTO.setErrorMsg("Brand not Saved");
            return new ResponseEntity<>(brandDTO, HttpStatus.OK);

        }

    }

    @GetMapping("/get")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<BrandDTO> getBrand(@RequestParam final long id) {

        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setBrandId(id);

        try {
                return new ResponseEntity<>(brandService.getBrandById(brandDTO), HttpStatus.OK);

        } catch (Exception ex) {
            brandDTO = new BrandDTO();
            brandDTO.setErrorCode(404);
            brandDTO.setErrorMsg("No Brand Found");
            return new ResponseEntity<>(brandDTO, HttpStatus.BAD_REQUEST);
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<BrandDTO> update(@RequestBody final BrandDTO brandDTO) {

        try {

            /*ModelMapper modelMapper = new ModelMapper();
            Brand brand = modelMapper.map(brandDTO, Brand.class);*/
            return new ResponseEntity<>(brandService.update(brandDTO), HttpStatus.OK);
        } catch (Exception ex) {

            BrandDTO DTO = new BrandDTO();
            brandDTO.setErrorCode(404);
            brandDTO.setErrorMsg("Brand not Saved");
            return new ResponseEntity<>(DTO, HttpStatus.BAD_REQUEST);
        }

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete")
    public ResponseEntity<Response> delete(@RequestBody final long id) {

        System.out.println("Brand delete controller called");

        try {
            boolean b = brandService.delete(new BrandDTO(id));
            if (b) {
                return new ResponseEntity<>(new Response("Brand Delete Successfully"), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new Response("No Brand Delete"), HttpStatus.OK);
            }
        } catch (Exception ex) {
            return new ResponseEntity<>(new Response("Unable to delete Brand"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/gets")
    public ResponseEntity<Page<BrandDTO>> showPage(final Pageable pageable) {

        try {
            log.debug("Inside try");
            return new ResponseEntity<>(brandService.findPage(pageable), HttpStatus.OK);
        } catch (Exception ex) {
            log.debug(ex.getMessage());
            return ResponseEntity.notFound().header(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()).build();
        }

    }


}
