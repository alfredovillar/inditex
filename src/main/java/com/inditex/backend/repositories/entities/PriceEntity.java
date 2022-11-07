package com.inditex.backend.repositories.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="PRICES")

public class PriceEntity {

    @Id
    @Column(name="price_id")
    private Integer priceId;
    @ManyToOne
    @JoinColumn(name="brand_id",referencedColumnName = "brand_id")
    private BrandEntity brand;
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
