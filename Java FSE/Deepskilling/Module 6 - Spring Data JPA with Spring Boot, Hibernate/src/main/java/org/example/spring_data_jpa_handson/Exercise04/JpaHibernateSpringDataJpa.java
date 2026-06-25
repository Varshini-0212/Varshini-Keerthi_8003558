package org.example.spring_data_jpa_handson.Exercise04;

public class JpaHibernateSpringDataJpa {

    public static void main(String[] args) {

        System.out.println("Difference between JPA, Hibernate and Spring Data JPA\n");

        System.out.println("1. JPA (Java Persistence API)");
        System.out.println("- JPA is a specification.");
        System.out.println("- It defines rules for object-relational mapping.");
        System.out.println("- It does not provide an implementation.\n");

        System.out.println("2. Hibernate");
        System.out.println("- Hibernate is an ORM framework.");
        System.out.println("- It is one of the implementations of JPA.");
        System.out.println("- It provides SessionFactory, Session and Transaction.\n");

        System.out.println("3. Spring Data JPA");
        System.out.println("- Built on top of JPA.");
        System.out.println("- Uses Hibernate internally by default.");
        System.out.println("- Reduces boilerplate code.");
        System.out.println("- Provides JpaRepository.");
        System.out.println("- Automatically manages transactions.");
    }
}