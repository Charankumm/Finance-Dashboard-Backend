# 💰 Finance Dashboard Backend

A Spring Boot-based backend application for managing financial records such as income and expenses. This project provides RESTful APIs to create, retrieve, summarize, and delete financial data.

---

## 🚀 Features

* ✅ Add Income & Expense Records
* ✅ Fetch All Records
* ✅ Get Financial Summary (Total Income, Expense, Balance)
* ✅ Delete Records
* ✅ MySQL Database Integration
* ✅ REST API Architecture
* ✅ Spring Security (Basic Setup)

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot
* **Database:** MySQL
* **ORM:** Hibernate (JPA)
* **Build Tool:** Maven
* **API Testing:** Postman
* **Language:** Java

---

## 📁 Project Structure

```
src/main/java/com/finance/dashboard
│
├── config          # Security configuration
├── controller      # REST Controllers
├── model           # Entity classes (Record, User, etc.)
├── repository      # JPA Repositories
├── service         # Business logic
└── DashboardApplication.java

src/main/resources
└── application.properties
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the Repository

```
git clone https://github.com/your-username/Finance-Dashboard-Backend.git
cd Finance-Dashboard-Backend
```

---

### 2️⃣ Configure MySQL

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

---

### 3️⃣ Run the Application

```
mvn spring-boot:run
```

---

## 📡 API Endpoints

### 🔹 Create Record

**POST** `/api/records`

```
{
  "amount": 3000,
  "type": "INCOME",
  "category": "Salary",
  "date": "2026-04-05",
  "description": "Monthly salary",
  "userId": 1
}
```

---

### 🔹 Get All Records

**GET** `/api/records`

---

### 🔹 Get Summary

**GET** `/api/records/summary`

---

### 🔹 Delete Record

**DELETE** `/api/records/{id}`

---

## 🧪 Testing (Postman)

* Use Postman to test APIs
* Set method (GET/POST/DELETE)
* Use `http://localhost:8080` base URL

---

## 🔐 Security

* Basic Spring Security configuration is enabled
* CSRF disabled for API testing
* All endpoints currently open (`permitAll`)

---

## 📌 Future Enhancements

* 🔐 JWT Authentication
* 📊 Dashboard UI (React)
* ☁️ Deployment (Render / AWS)
* 📈 Advanced Analytics

---

## 👨‍💻 Author

**Vadlakonda Charan Kumar**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
