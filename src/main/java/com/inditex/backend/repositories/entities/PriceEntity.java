package com.inditex.backend.repositories.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PriceEntity {

    @Id
    @Column(name="price_id")
    private Integer priceId;
    @Column(name="brand_id")
    private Integer brandId;
    @Column(name="start_date")

    private LocalDateTime startDate;
    @Column(name="end_date")

    private LocalDateTime endDate;
    @Column(name="price_list")

    private Integer priceList;
    @Column(name="product_id")

    private Integer productId;

    private Integer priority;

    private Double price;

    private String curr;

}
