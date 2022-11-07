package com.inditex.backend.services;

import com.inditex.backend.repositories.PriceJpaRepository;
import com.inditex.backend.repositories.entities.PriceEntity;
import com.inditex.backend.services.dto.PriceDomain;
import com.inditex.backend.services.dto.PriceDomainFilter;
import com.inditex.backend.repositories.mapper.PriceEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PriceServiceImp implements PriceService {
    private final PriceJpaRepository priceJpaRepository;
    private final PriceEntityMapper priceEntityMapper;
    @Override
    public PriceDomain getPriceFiltered(PriceDomainFilter domainFilter) {
      Optional<PriceEntity> entity= priceJpaRepository.findById("1");
        return priceEntityMapper.toDomain(entity.get());
    }
}
