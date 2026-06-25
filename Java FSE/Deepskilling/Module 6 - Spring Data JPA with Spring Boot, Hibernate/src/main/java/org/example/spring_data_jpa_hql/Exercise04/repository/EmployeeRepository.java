package org.example.spring_data_jpa_hql.Exercise04.repository;

import org.example.spring_data_jpa_hql.Exercise04.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double getAverageSalary();

    @Query("""
           SELECT e.department.name, AVG(e.salary)
           FROM Employee e
           GROUP BY e.department.name
           """)
    List<Object[]> getAverageSalaryByDepartment();
}