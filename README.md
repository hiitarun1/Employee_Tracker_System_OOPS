# Employee_Tracker_System_OOPS

A simple **Object-Oriented Java application** that demonstrates the implementation of an employee tracker system.  
The system supports **Full-Time and Part-Time employees** and calculates their salaries using **polymorphism and abstraction**.

---

## 📌 Features

- Add employees to the tracker system
- Remove employees by ID
- Display employee details
- Calculate salaries dynamically using polymorphism
- Supports multiple employee types:
  - Full-Time Employees
  - Part-Time Employees

---

## 🧠 Concepts Used

This project demonstrates several **core Java OOP principles**:

### Abstraction
An abstract `Employee` class defines common properties and behaviors.

### Inheritance
`FullTimeEmployee` and `PartTimeEmployee` extend the `Employee` class.

### Polymorphism
`calculateSalary()` is implemented differently for each employee type.

### Encapsulation
Private fields with public getters ensure controlled access.

### Collections
Uses `ArrayList` to store and manage employees.

---

## 🏗 Project Structure
```bash
Employee Tracker System
│
├── Employee (Abstract Class)
│ ├── name
│ ├── id
│ ├── calculateSalary()
│
├── FullTimeEmployee
│ └── monthlySalary
│
├── PartTimeEmployee
│ ├── hoursWorked
│ └── hourlyRate
│
├── PayrollSystem
│ ├── addEmployee()
│ ├── removeEmployee()
│ └── displayEmployees()
│
└── Main
└── Runs the payroll system

```
---

## ⚙️ Salary Calculation

### Full-Time Employee
Salary = Monthly Salary


### Part-Time Employee
Salary = Hours Worked × Hourly Rate


---

## 🚀 How to Run

### 1. Compile the program

```bash
javac Main.java

java Main



