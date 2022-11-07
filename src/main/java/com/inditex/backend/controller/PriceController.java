package com.inditex.backend.controller;

import com.inditex.backend.controller.dto.GetPriceRequest;
import com.inditex.backend.controller.dto.GetPricesResponse;
import com.inditex.backend.controller.mapper.PriceDomainMapper;
import com.inditex.backend.services.PriceService;
import com.inditex.backend.services.dto.PriceDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PriceController {
    private final PriceService priceService;
    private final PriceDomainMapper mapper;

    @PostMapping("/prices")
    public GetPricesResponse retrievePriceFiltered(@RequestBody GetPriceRequest request) {
        PriceDomain priceDomain=priceService.getPriceFiltered(mapper.toDomain(request));
        if(priceDomain!=null)
        return mapper.toDtoResponse(priceDomain);
        else
            return null;
    }

}
