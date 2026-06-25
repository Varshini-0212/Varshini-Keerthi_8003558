package org.example.spring_data_jpa_querymethods.Exercise02.service;

import org.example.spring_data_jpa_querymethods.Exercise02.model.StockDetails;
import org.example.spring_data_jpa_querymethods.Exercise02.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    public List<StockDetails> getStocksByDate(LocalDate date) {
        return repository.findByDate(date);
    }

    public List<StockDetails> getStocksGreaterThan(Double price) {
        return repository.findByClosePriceGreaterThan(price);
    }

    public List<StockDetails> getTop3Highest() {
        return repository.findTop3ByOrderByClosePriceDesc();
    }

    public List<StockDetails> getTop3Lowest() {
        return repository.findTop3ByOrderByClosePriceAsc();
    }
}