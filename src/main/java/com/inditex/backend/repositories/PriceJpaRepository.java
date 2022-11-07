package com.inditex.backend.repositories;

import com.inditex.backend.repositories.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceJpaRepository extends JpaRepository<PriceEntity,String> {

    @Query("from PRICE where brand_id = :filter.brandId AND product_id = :filter.productId AND start_date > = filter.date AND end_date < = filter.date")
    PriceEntity findByFilter(PricesFilter filter);
}
