package com.inditex.backend.controller.mapper;

import com.inditex.backend.controller.dto.GetPriceRequest;
import com.inditex.backend.controller.dto.GetPricesResponse;
import com.inditex.backend.services.dto.PriceDomain;
import com.inditex.backend.services.dto.PriceDomainFilter;
import org.springframework.stereotype.Component;

@Component
public class PriceDomainMapper {


    public GetPricesResponse toDtoResponse(PriceDomain priceDomain){
        GetPricesResponse response=new GetPricesResponse();
        response.setBrandId(priceDomain.getBrandId());
        response.setProductId(priceDomain.getProductId());
        response.setPrice(priceDomain.getPrice());
        response.setEndDate(priceDomain.getEndDate());
        response.setStartDate(priceDomain.getStartDate());
        response.setPriceList(priceDomain.getPriceList());
        return response;
    }
    public PriceDomainFilter toDomain(GetPriceRequest request){
        PriceDomainFilter filter=new PriceDomainFilter();
        filter.setBrandId(request.getBrandId());
        filter.setProductId(request.getProductId());
        filter.setDate(request.getDate());

        return filter;
    }
}
