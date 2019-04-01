package com.org.inventorymanagement.Services;

import com.org.inventorymanagement.Entities.Currency;
import com.org.inventorymanagement.Models.CurrencyDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CurrencyService {

    public Currency save(Currency currency);
    public Currency getCurrencyById(long id);
    public Currency update(Currency currency);
    public Boolean delete(long id);
    public Page<CurrencyDTO> findPage(Pageable pageable);
}
