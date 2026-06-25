package org.example.spring_data_jpa_querymethods.Exercise04;

import org.example.spring_data_jpa_querymethods.Exercise04.model.Employee;
import org.example.spring_data_jpa_querymethods.Exercise04.model.Skill;
import org.example.spring_data_jpa_querymethods.Exercise04.service.EmployeeService;
import org.example.spring_data_jpa_querymethods.Exercise04.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="org.example.spring_data_jpa_querymethods.Exercise04")
public class SpringDataJpaEmployeeSkillApplication implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    SkillService skillService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaEmployeeSkillApplication.class,args);
    }

    @Override
    public void run(String... args){

        Employee employee = employeeService.get(1);

        System.out.println("Employee:");
        System.out.println(employee);

        System.out.println("\nSkills:");
        employee.getSkillList().forEach(System.out::println);

        Skill skill = skillService.get(3);

        employee.getSkillList().add(skill);

        employeeService.save(employee);

        System.out.println("\nSkill Added Successfully");
    }
}