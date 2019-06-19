package com.org.inventorymanagement.Services.Currencies;

import com.org.inventorymanagement.Configurations.ModelEntityConversionUtil;
import com.org.inventorymanagement.Entities.Currency;
import com.org.inventorymanagement.Models.CurrencyDTO;
import com.org.inventorymanagement.Repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
@Transactional
public class CurrencyServiceImpl implements CurrencyService {

    private final CurrencyRepository currencyRepository;

    @Value("${app.upload.path}")
    private static String uploadPath;

    @Autowired
    public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }


    @Override
    @Cacheable(value = "currencies", key = "#currencyDTO.currId",unless = "#result== null")
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public CurrencyDTO save(CurrencyDTO currencyDTO, MultipartFile multipartFile) {

        try{

            CurrencyDTO DTO = fileUpload(currencyDTO,multipartFile);

            return ModelEntityConversionUtil.convert(currencyRepository.save(ModelEntityConversionUtil.convert(DTO, Currency.class)),CurrencyDTO.class);
        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }

        return null;
    }

    @Override
    @Cacheable(value = "currencies", key = "#currencyDTO.currId", unless = "#result== null")
    @Transactional(rollbackFor = Exception.class, timeout = 5000, readOnly = true)
    public CurrencyDTO getCurrencyById(CurrencyDTO currencyDTO) {
        try{

            CurrencyDTO DTO = ModelEntityConversionUtil.convert(currencyRepository.getOne(currencyDTO.getCurrId()),CurrencyDTO.class);

            MultipartFile multipartFile = (MultipartFile) getFile(DTO.getImagePath());

            //return ModelEntityConversionUtil.convert(currencyRepository.getOne(currencyDTO.getCurrId()),CurrencyDTO.class);

        }catch (Exception ex){

            System.out.println(ex.getCause().getMessage());
        }


        return null;
    }

    @Override
    @CachePut(value = "currencies", key = "#currencyDTO.currId", unless = "#result== null")
    @Transactional(rollbackFor = Exception.class, timeout = 5000, readOnly = true)
    public CurrencyDTO update(CurrencyDTO currencyDTO) {
        try {

            return ModelEntityConversionUtil.convert(currencyRepository.save(ModelEntityConversionUtil.convert(currencyDTO, Currency.class)),CurrencyDTO.class);
        } catch (Exception ex) {
            System.out.println(ex.getCause().getMessage());
            return null;
        }
    }

    @Override
    public Boolean delete(CurrencyDTO currencyDTO) {

        try {
            currencyRepository.deleteById(currencyDTO.getCurrId());
            return true;
        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }

        return false;
    }

    private CurrencyDTO fileUpload(CurrencyDTO currencyDTO, MultipartFile multipartFile){

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
            return currencyDTO;

        } catch (Exception e) {
            e.getCause().getMessage();
        }

        return null;
    }

    public File getFile(String fileLocation){

        try{
            return ResourceUtils.getFile(fileLocation);
        }catch (IOException io){
            System.out.println(io.getCause().getMessage());
        }

        return null;
    }

    @Override
    public Page<CurrencyDTO> findPage(Pageable pageable) {
        return null;
    }
}
