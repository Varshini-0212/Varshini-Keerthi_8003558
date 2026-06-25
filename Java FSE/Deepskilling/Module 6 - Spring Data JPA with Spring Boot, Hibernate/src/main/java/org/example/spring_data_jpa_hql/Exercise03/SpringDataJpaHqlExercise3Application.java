package org.example.spring_data_jpa_hql.Exercise03;

import org.example.spring_data_jpa_hql.Exercise03.model.Employee;
import org.example.spring_data_jpa_hql.Exercise03.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.spring_data_jpa_hql.Exercise03")
public class SpringDataJpaHqlExercise3Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHqlExercise3Application.class, args);
    }

    @Override
    public void run(String... args) {

        employeeService.getPermanentEmployees().forEach(employee -> {

            System.out.println(employee);

            System.out.println("Department : " + employee.getDepartment());

            System.out.println("Skills :");

            employee.getSkillList().forEach(System.out::println);

            System.out.println("--------------------------------");
        });
    }
}