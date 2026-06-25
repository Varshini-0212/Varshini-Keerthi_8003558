package org.example.spring_data_jpa_querymethods.Exercise01.service;

import org.example.spring_data_jpa_querymethods.Exercise01.model.Country;
import org.example.spring_data_jpa_querymethods.Exercise01.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public List<Country> searchContains(String text) {
        return repository.findByNameContaining(text);
    }

    public List<Country> searchStartsWith(String text) {
        return repository.findByNameStartingWith(text);
    }

    public List<Country> getCountriesSorted() {
        return repository.findAllByOrderByNameAsc();
    }
}