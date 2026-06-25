package org.example.spring_data_jpa_querymethods.Exercise04.service;

import org.example.spring_data_jpa_querymethods.Exercise04.model.Employee;
import org.example.spring_data_jpa_querymethods.Exercise04.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee get(Integer id){
        return repository.findById(id).orElse(null);
    }

    public Employee save(Employee employee){
        return repository.save(employee);
    }
}