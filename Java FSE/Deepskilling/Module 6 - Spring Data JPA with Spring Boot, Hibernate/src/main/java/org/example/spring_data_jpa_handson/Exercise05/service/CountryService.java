package org.example.spring_data_jpa_handson.Exercise05.service;

import org.example.spring_data_jpa_handson.Exercise05.model.Country;
import org.example.spring_data_jpa_handson.Exercise05.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public Optional<Country> getCountry(String code) {
        return repository.findById(code);
    }

    public Country addCountry(Country country) {
        return repository.save(country);
    }

    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }
}