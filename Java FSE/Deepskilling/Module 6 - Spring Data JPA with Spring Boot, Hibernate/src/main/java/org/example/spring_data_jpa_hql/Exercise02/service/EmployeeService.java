package org.example.spring_data_jpa_hql.Exercise02.service;

import org.example.spring_data_jpa_hql.Exercise02.model.Employee;
import org.example.spring_data_jpa_hql.Exercise02.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getPermanentEmployees() {
        return repository.getPermanentEmployees();
    }
}