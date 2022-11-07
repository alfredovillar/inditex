package com.inditex.backend.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetPriceRequest {
    private Integer productId;
    private Integer brandId;
    private String date;
}
