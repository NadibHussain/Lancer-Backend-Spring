
# Spring Boot Application with JWT Authentication

This is a minimal Spring Boot application that demonstrates a basic JWT-based authentication system. The application includes two models and requires users to provide their own `application.yml` for environment-specific configurations.

---

## Features
- Basic JWT Authentication System
- Two Example Models: `User` and `Post`
- CRUD Operations on Models
- Lightweight and easy to set up

---

## Prerequisites
- Java 17 or later
- Maven
- PostgreSQL or any relational database (configurable in `application.yml`)

---

## Models

1. **User**
   - Represents a user in the system.
   - Fields: `id`, `username`, `password`, `role`

2. **Post**
   - Represents a post created by a user.
   - Fields: `id`, `title`, `content`, `createdBy`

---

## Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. Add your `application.yml` file to the `src/main/resources` directory with the following structure:
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/your_database
       username: your_username
       password: your_password
     jpa:
       hibernate:
         ddl-auto: update
       properties:
         hibernate:
           dialect: org.hibernate.dialect.PostgreSQLDialect
   jwt:
     issuer: your-issuer
     secretKey: your-secret-key
     expirationMinute: 60
   ```

3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. Test the application:
   - Use Postman or a similar tool to test the following endpoints:
     - **POST `/auth/login`**: Authenticate and get a JWT.
     - **GET `/posts`**: Access secured resources using the token.

---

## Endpoints

### Authentication
- **POST `/auth/login`**
  - Body:
    ```json
    {
      "username": "testuser",
      "password": "password123"
    }
    ```

### Posts
- **GET `/posts`**
  - Header:
    ```
    Authorization: Bearer <JWT_TOKEN>
    ```

---

## License
This project is licensed under the MIT License.

Feel free to modify and use it for your projects!
