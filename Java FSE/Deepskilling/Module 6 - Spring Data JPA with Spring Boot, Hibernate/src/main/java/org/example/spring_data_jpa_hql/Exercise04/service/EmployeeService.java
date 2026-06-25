package org.example.spring_data_jpa_hql.Exercise04.service;

import org.example.spring_data_jpa_hql.Exercise04.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Double getAverageSalary() {
        return repository.getAverageSalary();
    }

    public List<Object[]> getAverageSalaryByDepartment() {
        return repository.getAverageSalaryByDepartment();
    }
}