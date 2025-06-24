# Online Quiz System – Microservices-Based Java Project

This is a microservices-based **Online Quiz System** built using Spring Boot. It is designed with service decoupling in mind for scalability, modularity, and maintainability. Each module runs as an independent microservice and communicates with others via REST APIs.

---

## 🛠️ Tech Stack

- Java 8
- Spring Boot (Microservices)
- Spring Cloud (Eureka, Config, API Gateway)
- Netflix Eureka (Service Discovery)
- Spring Cloud Gateway (API Gateway)
- Load Balancing (via Eureka + Ribbon)
- Maven
- REST API
- MySQL (or in-memory H2)
- Postman (for testing)

---

## 🔁 Microservices Overview

### 1. **Quiz Service**
- CRUD operations for quizzes
- Connects to `question-service` to fetch question list per quiz

### 2. **Question Service**
- CRUD operations for questions
- Exposes APIs to return questions by quiz ID

### 3. **API Gateway**
- All requests go through the gateway
- Routes requests to appropriate services
- Enables CORS, security, rate-limiting, etc.

### 4. **Eureka Service Registry**
- Service Discovery for all microservices
- Enables load balancing and failure tolerance

---

## 📦 Features

- ✅ Microservice architecture with loose coupling
- ✅ Eureka service registration & discovery
- ✅ Load-balanced REST APIs
- ✅ Central API Gateway handling routing
- ✅ Well-defined RESTful services for quiz and questions
- ✅ Modular, scalable, easy to extend

---

## 🚀 How to Run

### Prerequisites:
- Java 8
- Maven
- MySQL or H2 (if used)
- IDE like IntelliJ/Eclipse

### Step-by-Step:

1. **Start Eureka Server**  
   Run `EurekaServerApplication.java`

2. **Run Question Service**  
   Run `QuestionServiceApplication.java`

3. **Run Quiz Service**  
   Run `QuizServiceApplication.java`

4. **Run API Gateway**  
   Run `ApiGatewayApplication.java`

5. **Access Services**  
   - API Gateway: `http://localhost:8080/`
   - Eureka Dashboard: `http://localhost:8761/`
   - Quiz API: `http://localhost:8080/quiz/`
   - Question API: `http://localhost:8080/question/`

---

## 🧪 Example API Endpoints

### Quiz Service (via Gateway):
- `GET /quiz/`
- `GET /quiz/{quizId}`

### Question Service (via Gateway):
- `GET /question/quiz/{quizId}`
- `POST /question/`

---

## 📌 Tips

- Ensure all services register to Eureka before accessing via Gateway
- Enable CORS if accessing from frontend apps (React/Angular)
- Use Postman for testing endpoints
- Future enhancement: Add user service and authentication

---

## 👨‍💻 Author

**Aditya Talaviya**  
_Java Developer | Microservices Enthusiast_

---

## 📄 License

This project is open-source and free to use under the [MIT License](LICENSE).


