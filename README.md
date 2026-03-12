![Task Manager API](assets/project-banner.png.png)
# Task Manager API

A Spring Boot REST API for managing tasks.

## Features
- Create Task
- Get All Tasks
- Delete Task
- Layered Architecture

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## API Endpoints

GET /tasks  
POST /tasks  
DELETE /tasks/{id}

Example Request:

{
 "title": "Finish Backend API",
 "description": "Complete task manager backend",
 "status": "IN_PROGRESS"
}
## 📸 API Testing

### Get Tasks API

![Get Tasks](screenshots/api-get-tasks.png)
## 📬 Postman Collection

You can test APIs using the Postman collection below.

[Download Postman Collection](postman/task-api.postman_collection.json)
