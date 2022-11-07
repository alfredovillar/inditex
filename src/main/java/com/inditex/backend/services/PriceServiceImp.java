package com.inditex.backend.services;

import com.inditex.backend.repositories.PriceJpaRepository;
import com.inditex.backend.repositories.PricesFilter;
import com.inditex.backend.repositories.entities.PriceEntity;
import com.inditex.backend.services.dto.PriceDomain;
import com.inditex.backend.services.dto.PriceDomainFilter;
import com.inditex.backend.services.mapper.PriceDomainMapper;
import com.inditex.backend.services.mapper.PriceFilterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PriceServiceImp implements PriceService {
    private final PriceJpaRepository priceJpaRepository;
    private final PriceFilterMapper mapper;
    private final PriceDomainMapper priceDomainMapper;
    @Override
    public PriceDomain getPriceFiltered(PriceDomainFilter domainFilter) {
        PricesFilter filter=mapper.toModel(domainFilter);
       PriceEntity entity= priceJpaRepository.findByFilter(filter);
        return priceDomainMapper.toDomain(entity);
    }
}
