package com.inditex.backend.services.mapper;

import com.inditex.backend.repositories.PricesFilter;
import com.inditex.backend.services.dto.PriceDomainFilter;
import org.springframework.stereotype.Component;

@Component
public class PriceFilterMapper {

    public PricesFilter toModel(PriceDomainFilter filter) {
        PricesFilter pricesFilter=new PricesFilter();
        pricesFilter.setBrandId(filter.getBrandId());
        pricesFilter.setProductId(filter.getProductId());
        pricesFilter.setDate(filter.getDate());

        return pricesFilter;
    }
}
