package com.inditex.backend.repositories;

import com.inditex.backend.repositories.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesJpaRepository extends JpaRepository<PriceEntity,String> {
}
