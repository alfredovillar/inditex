package com.inditex.backend.services;

import com.inditex.backend.services.dto.PriceDomain;
import com.inditex.backend.services.dto.PriceDomainFilter;

public interface PriceService {
     PriceDomain getPriceFiltered(PriceDomainFilter filter);
}
