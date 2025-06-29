## Airline Reservation System 

A simple Airline Reservation System backend built with Java and Spring Boot.  
This RESTful API allows managing flights, users, and bookings using an in-memory H2 database.

---

## Project Overview

This project demonstrates a basic airline reservation system backend with the following capabilities:

- Manage flights (create, retrieve, update, delete)  
- Register and manage users  
- Book flights for users  
- Uses Spring Boot with layered architecture: Controller, Service, Repository, Model  
- H2 in-memory database for easy setup and testing  

---

## Technologies Used

- Java 17+  
- Spring Boot 3.5.3  
- H2 Database (in-memory)  
- Maven  

---

## Setup & Run

### Prerequisites

- Java 17 or higher  
- Maven installed (optional, since Maven Wrapper is included)  

### Steps to Run

1. Clone the repo  
```bash
git clone https://github.com/your-username/airline-reservation.git
cd airline-reservation
````

2. Run the project using Maven Wrapper

```bash
./mvnw spring-boot:run        # Linux/macOS
.\mvnw.cmd spring-boot:run    # Windows PowerShell
```

3. Application will start at:

```
http://localhost:8080
```

---

## API Endpoints

Base URL: `http://localhost:8080/api`

### Flights

| Method | Endpoint      | Description         |
| ------ | ------------- | ------------------- |
| GET    | /flights      | List all flights    |
| GET    | /flights/{id} | Get flight by ID    |
| POST   | /flights      | Add a new flight    |
| PUT    | /flights/{id} | Update flight by ID |
| DELETE | /flights/{id} | Delete flight by ID |

### Users

| Method | Endpoint    | Description       |
| ------ | ----------- | ----------------- |
| GET    | /users      | List all users    |
| GET    | /users/{id} | Get user by ID    |
| POST   | /users      | Add a new user    |
| PUT    | /users/{id} | Update user by ID |
| DELETE | /users/{id} | Delete user by ID |

### Bookings

| Method | Endpoint       | Description          |
| ------ | -------------- | -------------------- |
| GET    | /bookings      | List all bookings    |
| GET    | /bookings/{id} | Get booking by ID    |
| POST   | /bookings      | Create a booking     |
| DELETE | /bookings/{id} | Delete booking by ID |

---

## Sample JSON for POST requests

**Add Flight**

```json
{
  "airline": "IndiGo",
  "source": "Delhi",
  "destination": "Mumbai",
  "departureTime": "2025-07-10T10:00:00"
}
```

**Add User**

```json
{
  "name": "Rohit Sharma",
  "email": "rohit@example.com"
}
```

**Create Booking**

```json
{
  "user": { "id": 1 },
  "flight": { "id": 1 },
  "bookingDate": "2025-07-01"
}
```

---

## Testing the API

Use tools like Postman, Insomnia, curl or PowerShell.

Example curl to add a flight:

```bash
curl -X POST http://localhost:8080/api/flights \
-H "Content-Type: application/json" \
-d '{"airline":"IndiGo","source":"Delhi","destination":"Mumbai","departureTime":"2025-07-10T10:00:00"}'
```

---

## Future Improvements

* Add authentication and authorization
* Persist data with a real database like MySQL or PostgreSQL
* Build a frontend UI (React, Angular, etc.)
* Add validation and exception handling
* Write unit and integration tests

---

## Author

**Eshanchi Bajpai**
GitHub: [https://github.com/eshanchi-bajpai](https://github.com/eshanchi-bajpai)

---

## License

This project is licensed under the MIT License.

```
