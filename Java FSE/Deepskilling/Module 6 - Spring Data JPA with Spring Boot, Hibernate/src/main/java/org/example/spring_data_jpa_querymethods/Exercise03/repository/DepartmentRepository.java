package org.example.spring_data_jpa_querymethods.Exercise03.repository;

import org.example.spring_data_jpa_querymethods.Exercise03.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}