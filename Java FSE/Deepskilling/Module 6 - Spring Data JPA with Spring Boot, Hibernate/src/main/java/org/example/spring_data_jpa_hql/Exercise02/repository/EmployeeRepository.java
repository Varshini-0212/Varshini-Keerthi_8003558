package org.example.spring_data_jpa_hql.Exercise02.repository;

import org.example.spring_data_jpa_hql.Exercise02.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("""
           SELECT e
           FROM Employee e
           LEFT JOIN FETCH e.department
           WHERE e.permanent = true
           """)
    List<Employee> getPermanentEmployees();
}