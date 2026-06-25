package org.example.spring_data_jpa_querymethods.Exercise02.repository;

import org.example.spring_data_jpa_querymethods.Exercise02.model.StockDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<StockDetails, Integer> {

    List<StockDetails> findByDate(LocalDate date);

    List<StockDetails> findByClosePriceGreaterThan(Double price);

    List<StockDetails> findTop3ByOrderByClosePriceDesc();

    List<StockDetails> findTop3ByOrderByClosePriceAsc();
}