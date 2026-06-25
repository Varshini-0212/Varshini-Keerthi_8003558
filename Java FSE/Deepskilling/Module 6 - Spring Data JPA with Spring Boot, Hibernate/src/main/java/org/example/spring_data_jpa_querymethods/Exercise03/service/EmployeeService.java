package org.example.spring_data_jpa_querymethods.Exercise03.service;

import org.example.spring_data_jpa_querymethods.Exercise03.model.Employee;
import org.example.spring_data_jpa_querymethods.Exercise03.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee getEmployee(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
}