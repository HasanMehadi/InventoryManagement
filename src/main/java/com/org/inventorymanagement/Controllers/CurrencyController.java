package com.org.inventorymanagement.Controllers;

import com.org.inventorymanagement.Configurations.Response;
import com.org.inventorymanagement.Entities.Currency;
import com.org.inventorymanagement.Models.CurrencyDTO;
import com.org.inventorymanagement.Services.Currencies.CurrencyService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping(value = "/currency")
public class CurrencyController {

    private final Logger log = LoggerFactory.getLogger(CurrencyController.class);

    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<CurrencyDTO> save(final @RequestPart("currency") CurrencyDTO currencyDTO, final @RequestPart("file") MultipartFile multipartFile) {



        /*ModelMapper modelMapper = new ModelMapper();
        Currency currency = modelMapper.map(currencyDTO, Currency.class);*/
        try {
            return new ResponseEntity<>(currencyService.save(currencyDTO, multipartFile), HttpStatus.OK);
        } catch (Exception ex) {

            System.out.println(ex.getCause().getMessage());
            CurrencyDTO DTO = new CurrencyDTO();
            currencyDTO.setErrorCode(404);
            currencyDTO.setErrorMsg("Currency not Saved");
            return new ResponseEntity<>(DTO, HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/get")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CurrencyDTO> getCurrency(final @RequestParam long id) {


        try {

            CurrencyDTO currencyDTO= new CurrencyDTO();
            currencyDTO.setCurrId(id);
            /*
            Currency currency = currencyService.getCurrencyById(id);
            currencyDTO = modelMapper.map(currency, CurrencyDTO.class);
            System.out.println(currencyDTO);*/

            return new ResponseEntity<>(currencyDTO, HttpStatus.OK);


        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            CurrencyDTO currencyDTO = new CurrencyDTO();
            currencyDTO.setErrorCode(404);
            currencyDTO.setErrorMsg("No Currency Found");
            return new ResponseEntity<>(currencyDTO, HttpStatus.BAD_REQUEST);
        }

    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete")
    public ResponseEntity<Response> delete(@RequestBody long id) {

        try {
            CurrencyDTO DTO = new CurrencyDTO();
            DTO.setCurrId(id);
            boolean b = currencyService.delete(DTO);

            if (b) {
                return new ResponseEntity<>(new Response("Currency Delete Successfully"), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new Response("No Currency Delete"), HttpStatus.OK);
            }
        } catch (Exception ex) {

            System.out.println(ex.getCause().getMessage());
            return new ResponseEntity<>(new Response("Unable to Delete Currency"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/gets")
    public ResponseEntity<Page<CurrencyDTO>> showPage(Pageable pageable) {

        try {

            return new ResponseEntity<>(currencyService.findPage(pageable), HttpStatus.OK);
        } catch (Exception ex) {
            log.debug(ex.getMessage());
            return ResponseEntity.notFound().header(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()).build();
        }

    }
}
