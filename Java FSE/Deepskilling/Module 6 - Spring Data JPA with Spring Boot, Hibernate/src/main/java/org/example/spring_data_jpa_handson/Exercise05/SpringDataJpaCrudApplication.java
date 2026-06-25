package org.example.spring_data_jpa_handson.Exercise05;

import org.example.spring_data_jpa_handson.Exercise05.model.Country;
import org.example.spring_data_jpa_handson.Exercise05.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_handson.Exercise05")
public class SpringDataJpaCrudApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaCrudApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("----- ALL COUNTRIES -----");
        countryService.getAllCountries().forEach(System.out::println);

        System.out.println("\n----- FIND COUNTRY -----");
        System.out.println(countryService.getCountry("IN"));

        System.out.println("\n----- ADD COUNTRY -----");
        countryService.addCountry(new Country("JP", "Japan"));
        countryService.getAllCountries().forEach(System.out::println);

        System.out.println("\n----- UPDATE COUNTRY -----");
        countryService.updateCountry(new Country("JP", "Japan Updated"));
        countryService.getAllCountries().forEach(System.out::println);

        System.out.println("\n----- DELETE COUNTRY -----");
        countryService.deleteCountry("JP");
        countryService.getAllCountries().forEach(System.out::println);
    }
}