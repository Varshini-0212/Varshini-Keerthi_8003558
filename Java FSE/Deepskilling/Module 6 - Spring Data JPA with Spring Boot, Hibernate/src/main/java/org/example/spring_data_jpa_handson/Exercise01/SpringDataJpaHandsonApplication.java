package org.example.spring_data_jpa_handson.Exercise01;

import org.example.spring_data_jpa_handson.Exercise01.model.Country;
import org.example.spring_data_jpa_handson.Exercise01.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaHandsonApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHandsonApplication.class, args);
    }

    @Override
    public void run(String... args) {

        List<Country> countries = countryService.getAllCountries();

        System.out.println("Countries:");

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}