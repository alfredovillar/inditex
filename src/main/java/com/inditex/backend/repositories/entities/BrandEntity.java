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
@Entity(name="BRAND")
public class BrandEntity {

    @Id
    @Column(name="brand_id")
    private Integer brandId;
   @Column(name="brand_name")
    private String brandName;

}
