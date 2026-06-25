package org.example.spring_data_jpa_querymethods.Exercise01.repository;

import org.example.spring_data_jpa_querymethods.Exercise01.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Find countries containing the given text
    List<Country> findByNameContaining(String text);

    // Find countries starting with the given text
    List<Country> findByNameStartingWith(String text);

    // Find all countries ordered by name
    List<Country> findAllByOrderByNameAsc();
}