package com.inditex.backend.repositories;

import com.inditex.backend.repositories.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface PriceJpaRepository extends JpaRepository<PriceEntity,String> {

    @Query("from PRICE where  productId=:productId")
    PriceEntity findByProductId(@Param("productId") Integer productId);
}
