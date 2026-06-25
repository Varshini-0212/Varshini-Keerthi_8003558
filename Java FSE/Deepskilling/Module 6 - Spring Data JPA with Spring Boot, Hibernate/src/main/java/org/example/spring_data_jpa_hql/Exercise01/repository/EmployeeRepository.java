package org.example.spring_data_jpa_hql.Exercise01.repository;

import org.example.spring_data_jpa_hql.Exercise01.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE e.permanent = true")
    List<Employee> getPermanentEmployees();

}