# Module 8 - Microservices with Spring Boot 3 and Spring Cloud

## Overview

This module demonstrates the implementation of a Microservices architecture using Spring Boot 3 and Spring Cloud.

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Cloud
- Spring Web
- Spring Cloud Gateway
- Eureka Discovery Server
- Config Server
- Maven

## Projects

### 1. Eureka Discovery Server
- Service Registry
- Runs on Port 8761

### 2. Account Service
- Provides Account Details
- Registered with Eureka
- Runs on Port 8081

### 3. Loan Service
- Provides Loan Details
- Registered with Eureka
- Runs on Port 8082

### 4. API Gateway
- Central API Gateway
- Dynamic Routing
- Global Request Logging
- Runs on Port 9090

### 5. Config Server
- Centralized Configuration Management
- Runs on Port 8888

### 6. Greet Service
- Config Client
- Registered with Eureka
- Sample REST API

### 7. Product Service
- Sample Product Microservice
- Registered with Eureka

## Features

- Spring Cloud Eureka Service Discovery
- Spring Cloud Gateway
- Global Logging Filter
- Config Server
- REST APIs
- Microservices Architecture
- Service Registration & Discovery

## Learning Outcomes

- Develop independent microservices
- Register services using Eureka
- Route requests through API Gateway
- Centralize configuration using Config Server
- Implement Spring Cloud Gateway Filters
- Build scalable Spring Boot applications

## Author

**Varshini Keerthi**