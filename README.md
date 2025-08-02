# 🚀 rest-api-kotlin

A simple and modular RESTful API built with **Kotlin** and **Spring Boot**. This project demonstrates best practices for building scalable and maintainable backend services using a Kotlin-first approach within the Spring ecosystem.

---

## 🛠️ Tech Stack

- **Kotlin**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Flyway** 
- **JUnit** & **MockK** for testing
- **Gradle** or **Maven** for build

---

## 🧱 Project Structure
```plaintext
src/
 └── main/
     ├── kotlin/
     │   └── com/
     │       └── example/
     │           └── api/
     │               └── v1/
     │                   ├── controller/   # REST API endpoints (e.g., ItemController.kt)
     │                   ├── service/      # Business logic (e.g., ItemService.kt)
     │                   ├── repository/   # Database access (e.g., ItemRepository.kt)
     │                   └── model/        # Data models / entities (e.g., Item.kt)
     └── resources/
         ├── application.yml               # Spring Boot config (DB, port, etc.)
         └── db/
             └── migration/                # Optional: Flyway migration scripts (V1__init.sql, etc.)
```

---

## ⚙️ Setup & Configuration

### 1. 📦 Clone the Repository
```bash
git clone https://github.com/YJ0411/rest-api-kotlin.git
cd rest-api-kotlin
```
### 2. 🐘 Build the Project
```bash
./gradlew build
```
### 3. 🐘 Run the Application
```bash
./gradlew bootRun
```

---

## 🛢️ PostgreSQL Setup
### 1. Run PostgreSQL with Docker
```bash
docker run --name kotlin-postgres \
  -e POSTGRES_DB=kotlindb \
  -e POSTGRES_USER=kotlinuser \
  -e POSTGRES_PASSWORD=yourpassword \
  -p 5432:5432 \
  -d postgres
```
### 2. Configure application.yml
```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/kotlindb
    username: kotlinuser
    password: yourpassword
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

---

## 📡 Sample API Endpoints
| Method | Endpoint          | Description       |
| ------ | ----------------- | ----------------- |
| GET    | `/api/items`      | Get all items     |
| GET    | `/api/items/{id}` | Get item by ID    |
| POST   | `/api/items`      | Create new item   |
| PUT    | `/api/items/{id}` | Update item by ID |
| DELETE | `/api/items/{id}` | Delete item by ID |

---

## ✨ Credits

Crafted with Kotlin and Spring Boot to demonstrate clean, modular REST API development.  
Built and maintained by YJ(https://github.com/YJ0411).

Special thanks to the open-source community for the tools and libraries that make this possible.
