package org.example.spring_data_jpa_hql.Exercise01.service;

import org.example.spring_data_jpa_hql.Exercise01.model.Employee;
import org.example.spring_data_jpa_hql.Exercise01.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getPermanentEmployees() {
        return employeeRepository.getPermanentEmployees();
    }

}