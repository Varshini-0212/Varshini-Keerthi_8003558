package org.example.spring_data_jpa_querymethods.Exercise04.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double salary;

    private Boolean permanent;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="employee_skill",
            joinColumns=@JoinColumn(name="employee_id"),
            inverseJoinColumns=@JoinColumn(name="skill_id")
    )
    private Set<Skill> skillList=new HashSet<>();

    public Employee(){}

    public Integer getId(){ return id; }

    public void setId(Integer id){ this.id=id; }

    public String getName(){ return name; }

    public void setName(String name){ this.name=name; }

    public Double getSalary(){ return salary; }

    public void setSalary(Double salary){ this.salary=salary; }

    public Boolean getPermanent(){ return permanent; }

    public void setPermanent(Boolean permanent){ this.permanent=permanent; }

    public LocalDate getDateOfBirth(){ return dateOfBirth; }

    public void setDateOfBirth(LocalDate dateOfBirth){ this.dateOfBirth=dateOfBirth; }

    public Set<Skill> getSkillList(){ return skillList; }

    public void setSkillList(Set<Skill> skillList){ this.skillList=skillList; }

    @Override
    public String toString(){
        return "Employee{id="+id+", name='"+name+"'}";
    }
}