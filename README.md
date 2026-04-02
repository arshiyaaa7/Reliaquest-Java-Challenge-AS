# ReliaQuest Entry-Level Java Challenge

## Overview

This project implements a REST API for employee management as part of the **ReliaQuest Entry-Level Java Challenge**. The goal was to expose employee information through REST endpoints that could be consumed by an external SaaS platform.

The implementation focuses on clean structure, simple design, and practical implementation — without requiring persistence or database integration.

---

## Requirements

The assignment required implementing the following endpoints:

| # | Endpoint | Description |
|---|----------|-------------|
| 1 | `GET /api/v1/employee` | Get all employees |
| 2 | `GET /api/v1/employee/{uuid}` | Get employee by UUID |
| 3 | `POST /api/v1/employee` | Create a new employee |

> Persistence was not required — mock employee data is generated and stored in memory.

---

## Implementation Approach

### 1. Layered Architecture

The project follows a simple layered architecture:
```
Controller Layer   →   Handles HTTP requests and responses
Service Layer      →   Contains business logic
Model Layer        →   Employee interface and implementation
Exception Layer    →   Global exception handling
```

### 2. In-Memory Data Storage

Since persistence was not required, employee records are stored using an in-memory data structure acting as a mock database:
```java
Map<UUID, Employee> employeeStore = new HashMap<>();
```

### 3. Endpoint Implementations

#### `GET /api/v1/employee`
Returns a list of all employees currently stored in memory.

#### `GET /api/v1/employee/{uuid}`
Returns a single employee matching the provided UUID.
Returns an error response if the employee does not exist.

#### `POST /api/v1/employee`
Creates a new employee by:
- Generating a UUID
- Setting the contract hire date
- Storing the employee in memory
- Returning the created employee object

### 4. Global Exception Handling

A `@ControllerAdvice` global exception handler covers common API error scenarios:

| Scenario | HTTP Status |
|----------|-------------|
| Employee not found | `404 Not Found` |
| Invalid request body | `400 Bad Request` |
| Unexpected errors | `500 Internal Server Error` |

---

## Project Structure
```
src/main/java/com/reliaquest/
├── controller/       # REST controllers
├── service/          # Business logic
├── model/            # Employee interface & implementation
└── exception/        # Global exception handler
```
---

## Postman API Testing Screenshots

### Create Employee
<img width="2006" height="1457" alt="Screenshot 2026-04-02 175615" src="https://github.com/user-attachments/assets/c2c1f740-6026-4ae4-bcb5-b439c5ed8b97" />

### Get All Employees
<img width="2014" height="1475" alt="Screenshot 2026-04-02 180201" src="https://github.com/user-attachments/assets/fc9d0db4-b057-4462-b1fb-0f0c18c168a9" />


### Get Employee By UUID
<img width="2016" height="1364" alt="Screenshot 2026-04-02 180251" src="https://github.com/user-attachments/assets/9f2bfd89-da17-4d48-b187-6155161265b4" />

---

**Done By Arshiya Shaikh**
