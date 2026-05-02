# Book Library — Spring Boot Application

A simple full-stack web application for managing a book library.  
Built with Spring Boot, Spring Data JPA, MySQL, and Thymeleaf.

---

## Features

- Add new books (title, author, year)
- View list of all books
- View book details
- Delete books
- Simple web UI using Thymeleaf
- REST API for books management

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## Project Structure

src/main/java
├── controller # REST + Web controllers
├── service # Business logic layer
├── repository # JPA repositories
├── entity # Database entities
└── Main.java # Application entry point

---

## Setup Instructions

### 1. Clone the repository

</> bash
git clone https://github.com/your-username/book-library.git
cd book-library

### 2. Create MySQL database

</> SQL
CREATE DATABASE mybooklib;

### 3. Configure environment variables

Set your database password:

</> bash
export DB_PASSWORD=your_password

### 4. Configure application

application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/mybooklib
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

### 5. Run the application

</> bash
mvn spring-boot:run

### 6. Access

Open in browser:

http://localhost:8080

---

## REST API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| GET    | /books      | Get all books  |
| GET    | /books/{id} | Get book by ID |
| POST   | /books      | Add new book   |
| DELETE | /books/{id} | Delete book    |

---

## What I learned

-Spring Boot architecture (Controller → Service → Repository)
-Working with Spring Data JPA
-Connecting Spring Boot with MySQL
-Building simple MVC web UI with Thymeleaf
-REST API design basics

---