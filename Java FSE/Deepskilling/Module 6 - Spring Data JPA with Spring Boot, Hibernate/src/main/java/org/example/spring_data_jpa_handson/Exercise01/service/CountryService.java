package org.example.spring_data_jpa_handson.Exercise01.service;

import org.example.spring_data_jpa_handson.Exercise01.model.Country;
import org.example.spring_data_jpa_handson.Exercise01.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}