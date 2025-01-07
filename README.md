# Elite Motor Management System

The **Elite Motor Management System** is a console-based Java application designed to manage showrooms, employees, and bike inventory for a motor company. This project demonstrates key Object-Oriented Programming (OOP) principles, such as **Inheritance**, **Polymorphism**, and **Abstraction**, while maintaining a modular and extensible code structure. It enables users to interact with and manage the company's operations efficiently through a simple text-based interface.

## Features

- **Add Showroom**: Create and store details of new showrooms.
- **Add Employee**: Register employees with relevant personal and professional details.
- **Add Bike**: Maintain an inventory of bikes available in showrooms.
- **View Details**:
  - List all showrooms.
  - List all employees.
  - List all bikes.

## Key Components

The project is structured with the following key components:

- **EliteMotor**: The main class responsible for user interaction and overall system flow. It provides the user interface and manages all operations.
- **Utility Interface**: An interface that defines the structure for `getDetails()` and `setDetails()` methods. This ensures consistency across all entities (Showrooms, Employees, and Bikes).
- **Showroom Class**: Encapsulates showroom details such as location, name, and associated employees. It provides methods to manage showroom-specific operations.
- **Employee Class**: Represents employees within the motor company, storing details such as name, position, and contact information. It encapsulates employee behaviors and operations.
- **Bike Class**: Stores details about bikes, including model, brand, and price. The `Bike` class also implements polymorphic behavior for the utility methods to allow for dynamic interactions.

## Technologies Used

- **Programming Language**: Java
- **Object-Oriented Programming Principles**:
  - **Inheritance**
  - **Polymorphism**
  - **Abstraction via interfaces**
- **Console-Based Interaction**: Utilizes Java’s `Scanner` class for a simple text-based menu, making it easy to navigate the system and perform operations.

## How to Run the Project

1. Clone the repository to your local machine.
   ```bash
   git clone https://github.com/aklema094/Elite-Motor.git
