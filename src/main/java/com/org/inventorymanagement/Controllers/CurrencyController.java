package com.org.inventorymanagement.Controllers;

import com.org.inventorymanagement.Configurations.Response;
import com.org.inventorymanagement.Entities.Brand;
import com.org.inventorymanagement.Entities.Currency;
import com.org.inventorymanagement.Models.CurrencyDTO;
import com.org.inventorymanagement.Services.CurrencyService;
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

    @Autowired
    private CurrencyService currencyService;

    @Value("${app.upload.path}")
    private String uploadPath;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<CurrencyDTO> save(@RequestPart("currency") CurrencyDTO currencyDTO, @RequestPart("file") MultipartFile multipartFile) {

        String storedLocation;
        Path rootLocation = Paths.get(uploadPath);

        String filename = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        String extension = StringUtils.getFilenameExtension(filename);

        try {
            if (multipartFile.isEmpty()) {
                throw new IOException("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new IOException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            Files.copy(multipartFile.getInputStream(), rootLocation.resolve(currencyDTO.getCurrNm()+"."+extension),
                    StandardCopyOption.REPLACE_EXISTING);

            storedLocation = rootLocation + currencyDTO.getCurrNm()+"."+extension;
            currencyDTO.setImagePath(storedLocation);

        } catch (Exception e) {
           e.getCause().getMessage();
        }

        ModelMapper modelMapper = new ModelMapper();
        Currency currency = modelMapper.map(currencyDTO, Currency.class);

        System.out.println("Currency Add controller called");
        try {

            currencyDTO = modelMapper.map(currencyService.save(currency), CurrencyDTO.class);
            return new ResponseEntity<CurrencyDTO>(currencyDTO, HttpStatus.OK);
        } catch (Exception ex) {

            System.out.println(ex.getCause().getMessage());
            currencyDTO = new CurrencyDTO();
            currencyDTO.setErrorCode(404);
            currencyDTO.setErrorMsg("Brand not Saved");
            return new ResponseEntity<CurrencyDTO>(currencyDTO, HttpStatus.OK);

        }

    }

    @GetMapping("/get")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CurrencyDTO> getCurrency(@RequestParam long id) {

        System.out.println("Currency Get Item Called");

        CurrencyDTO currencyDTO= null;

        ModelMapper modelMapper = new ModelMapper();

        try {

            Currency currency = currencyService.getCurrencyById(id);
            currencyDTO = modelMapper.map(currency, CurrencyDTO.class);

            System.out.println(currencyDTO);

            if (currency != null) {
                return new ResponseEntity<CurrencyDTO>(currencyDTO, HttpStatus.OK);
            }

        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            currencyDTO = new CurrencyDTO();
            currencyDTO.setErrorCode(404);
            currencyDTO.setErrorMsg("No Brand Found");
            return new ResponseEntity<CurrencyDTO>(currencyDTO, HttpStatus.BAD_REQUEST);
        }

        return null;
    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete")
    public ResponseEntity<Response> delete(@RequestBody long id) {

        System.out.println("Currency delete controller called");

        try {
            boolean b = currencyService.delete(id);

            if (b) {
                return new ResponseEntity<Response>(new Response("Currency Delete Successfully"), HttpStatus.OK);
            } else {
                return new ResponseEntity<Response>(new Response("No Currency Delete"), HttpStatus.OK);
            }
        } catch (Exception ex) {

            System.out.println(ex.getCause().getMessage());
            return new ResponseEntity<Response>(new Response("Unable to Delete Currency"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/gets")
    public ResponseEntity<Page<CurrencyDTO>> showPage(Pageable pageable) {

        System.out.println("Currency Pageable Called");
        try {

            return new ResponseEntity<Page<CurrencyDTO>>(currencyService.findPage(pageable), HttpStatus.OK);
        } catch (Exception ex) {
            log.debug(ex.getMessage());
            return ResponseEntity.notFound().header(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()).build();
        }

    }
}
