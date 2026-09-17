Vehicle Data Manager

A Java-based application for managing vehicle records using a layered architecture.

Features
Add vehicle records
Retrieve vehicle records
Update vehicle records
Delete vehicle records
Handle vehicle-not-found scenarios using a custom exception
Technologies Used
Java
Object-Oriented Programming (OOP)
Java Collections Framework
ArrayList
Exception Handling
Project Architecture

The project follows a layered structure:

Controller Layer – Handles application requests.
Service Layer – Contains the application/business logic.
DAO Layer – Handles vehicle data operations.
Model Layer – Represents vehicle information.
Project Structure
Vehicle-Data-Manager/
│
├── Vehicle.java
├── VehicleController.java
├── VehicleDao.java
├── VehicleDaoImpl.java
├── VehicleService.java
├── VehicleServiceImpl.java
├── VehicleNotFoundException.java
└── README.md
How It Works

The application separates responsibilities across Controller, Service, and DAO layers. Vehicle data is managed within the application using Java collections, while custom exception handling is used for vehicle-not-found scenarios.

How to Run
Clone the repository.
Open the project in Eclipse, IntelliJ IDEA, or another Java IDE.
Configure a compatible Java JDK.
Run the application from the controller/application entry point.
