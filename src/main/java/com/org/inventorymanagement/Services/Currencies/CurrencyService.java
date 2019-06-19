package com.org.inventorymanagement.Services.Currencies;

import com.org.inventorymanagement.Entities.Currency;
import com.org.inventorymanagement.Models.CurrencyDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface CurrencyService {

    public CurrencyDTO save(CurrencyDTO currencyDTO, MultipartFile multipartFile);
    public CurrencyDTO getCurrencyById(CurrencyDTO currencyDTO);
    public CurrencyDTO update(CurrencyDTO currencyDTO);
    public Boolean delete(CurrencyDTO currencyDTO);
    public Page<CurrencyDTO> findPage(Pageable pageable);
}
