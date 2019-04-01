package com.org.inventorymanagement.ServiceImplementation;

import com.org.inventorymanagement.Entities.Currency;
import com.org.inventorymanagement.Models.CurrencyDTO;
import com.org.inventorymanagement.Services.CurrencyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CurrencyServiceImpl implements CurrencyService {
    @Override
    public Currency save(Currency currency) {
        return null;
    }

    @Override
    public Currency getCurrencyById(long id) {
        return null;
    }

    @Override
    public Currency update(Currency currency) {
        return null;
    }

    @Override
    public Boolean delete(long id) {
        return null;
    }

    @Override
    public Page<CurrencyDTO> findPage(Pageable pageable) {
        return null;
    }
}
