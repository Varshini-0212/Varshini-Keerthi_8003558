package org.example.spring_data_jpa_handson.Exercise01.repository;

import org.example.spring_data_jpa_handson.Exercise01.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}