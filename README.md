# Spring Boot API Testing with RestAssured

This project demonstrates how to perform automated testing for RESTful APIs in a **Spring Boot** application using **RestAssured** and **JUnit 5**.

## 🛠 Tech Stack

| **Layer**           | **Technology**            |
|---------------------|---------------------------|
| Language            | Java 17+                  |
| Test Framework      | JUnit 5                   |
| API Testing         | RestAssured               |
| Build Tool          | Maven                     |
| API                 | Spring Boot               |

## 📝 Features

- Perform automated tests on API endpoints (GET, POST, PUT, DELETE).
- Use **RestAssured** to send HTTP requests and validate responses.
- Easily extendable for more API tests.

## ⚙️ Setup

### 1. Clone the Repository

Clone this repository to your local machine:

```bash
git clone https://github.com/<your-github-username>/springboot-restassured-api-testing.git
cd springboot-restassured-api-testing
### 2. Install Dependencies
mvn clean install
### 3.Run the Application
mvn spring-boot:run
Example Endpoints in ProductController:
POST /api/products: Creates a new product.

GET /api/products/{id}: Retrieves product details by ID.

PUT /api/products/{id}: Updates an existing product.

DELETE /api/products/{id}: Deletes a product by ID.




