package org.example.spring_data_jpa_querymethods.Exercise01;

import org.example.spring_data_jpa_querymethods.Exercise01.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_querymethods.Exercise01")
public class SpringDataJpaQueryMethodsApplication implements CommandLineRunner {

    @Autowired
    private CountryService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaQueryMethodsApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("----- ALL COUNTRIES -----");
        service.getAllCountries().forEach(System.out::println);

        System.out.println("\n----- CONTAINS 'India' -----");
        service.searchContains("India").forEach(System.out::println);

        System.out.println("\n----- STARTS WITH 'United' -----");
        service.searchStartsWith("United").forEach(System.out::println);

        System.out.println("\n----- SORTED BY NAME -----");
        service.getCountriesSorted().forEach(System.out::println);
    }
}