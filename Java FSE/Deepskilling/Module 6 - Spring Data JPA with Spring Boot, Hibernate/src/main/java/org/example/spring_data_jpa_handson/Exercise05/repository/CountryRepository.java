package org.example.spring_data_jpa_handson.Exercise05.repository;

import org.example.spring_data_jpa_handson.Exercise05.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}