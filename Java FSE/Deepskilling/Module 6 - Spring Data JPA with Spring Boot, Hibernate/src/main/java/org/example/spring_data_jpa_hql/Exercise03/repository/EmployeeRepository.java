package org.example.spring_data_jpa_hql.Exercise03.repository;

import org.example.spring_data_jpa_hql.Exercise03.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("""
        SELECT DISTINCT e
        FROM Employee e
        LEFT JOIN FETCH e.department
        LEFT JOIN FETCH e.skillList
        WHERE e.permanent = true
    """)
    List<Employee> getPermanentEmployees();
}