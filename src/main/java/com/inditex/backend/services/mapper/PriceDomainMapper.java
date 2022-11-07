package com.inditex.backend.services.mapper;

import com.inditex.backend.repositories.entities.PriceEntity;
import com.inditex.backend.services.dto.PriceDomain;
import org.springframework.stereotype.Component;

@Component
public class PriceDomainMapper {

    public PriceDomain toDomain(PriceEntity entity) {
        PriceDomain domain=new PriceDomain();
        domain.setBrandId(entity.getBrand().getBrandId());
        domain.setPrice(entity.getPrice());
        domain.setProductId(entity.getProductId());
        domain.setPriceList(entity.getPriceList());
        domain.setStartDate(entity.getStartDate());
        domain.setEndDate(entity.getEndDate());
        return  domain;
    }
}
