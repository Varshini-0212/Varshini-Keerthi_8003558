package org.example.spring_data_jpa_querymethods.Exercise02;

import org.example.spring_data_jpa_querymethods.Exercise02.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_querymethods.Exercise02")
public class SpringDataJpaStockApplication implements CommandLineRunner {

    @Autowired
    private StockService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaStockApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("----- STOCKS ON 2024-09-05 -----");
        service.getStocksByDate(LocalDate.of(2024, 9, 5))
                .forEach(System.out::println);

        System.out.println("\n----- STOCKS WITH CLOSE PRICE > 1500 -----");
        service.getStocksGreaterThan(1500.0)
                .forEach(System.out::println);

        System.out.println("\n----- TOP 3 HIGHEST -----");
        service.getTop3Highest()
                .forEach(System.out::println);

        System.out.println("\n----- TOP 3 LOWEST -----");
        service.getTop3Lowest()
                .forEach(System.out::println);
    }
}