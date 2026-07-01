package org.example.employeeresthandson.service;

import org.example.employeeresthandson.dao.EmployeeDao;
import org.example.employeeresthandson.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee getEmployee() {
        return employeeDao.getEmployee();
    }
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }
    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }
}