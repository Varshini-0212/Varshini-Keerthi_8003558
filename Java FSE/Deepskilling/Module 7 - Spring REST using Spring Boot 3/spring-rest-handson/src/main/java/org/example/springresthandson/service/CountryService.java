package org.example.springresthandson.service;

import org.example.springresthandson.dao.CountryDao;
import org.example.springresthandson.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public Country getCountry() {
        return countryDao.getCountry();
    }
    public Country getCountryFromXml() {
        return countryDao.getCountryFromXml();
    }
    public Country getCountry(String code) {
        return countryDao.getCountry(code);
    }
    public List<Country> getAllCountries() {
        return countryDao.getAllCountries();
    }
}