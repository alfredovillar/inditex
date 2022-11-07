package com.inditex.backend.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceFilter {
    private Integer productId;
    private Integer brandId;
    private LocalDateTime date;


}
