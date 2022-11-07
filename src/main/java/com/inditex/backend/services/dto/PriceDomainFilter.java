package com.inditex.backend.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceDomainFilter {
    private Integer productId;
    private Integer brandId;
    private LocalDateTime date;

}
