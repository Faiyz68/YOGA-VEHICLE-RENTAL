 🌍 Yoga Vehicle Rental System - Comprehensive MVP Specification

Welcome to the **Yoga Vehicle Rental System**, an advanced, console-based enterprise simulation application written in Java. Operating under the philosophy *"Breathe In, Drive Out. Your flexible journey starts here,"* this system provides a seamless, robust platform for users to manage, select, and rent a diverse fleet of land, air, and water transportation assets.

This project serves as a comprehensive Minimum Viable Product (MVP) engineered specifically to map against rigorous industrial software development benchmarks and institutional grading rubrics (covering V1.0 through V4.0 object-oriented paradigms). By leveraging a strict multi-package architectural boundaries system, this application ensures deep decoupling, high modularity, and enterprise-grade maintainability.

---

## 📂 System Architecture & Package Topology

To reflect modern software engineering standards, the system completely isolates user-facing application logic from core data structures. This prevents package pollution and guarantees clean structural boundaries.

```text
MVP/
│
├── main/
│   └── Main.java             # System Orchestrator, CLI User Interface, & Control Flow Routing
│
└── vehicles/
    ├── Vehicle.java          # Parent Framework Class (Base Data Definition & Structural Rules)
    ├── Car.java              # Land Asset Class (Dynamically adapts for standard, Sports, and SUV profiles)
    ├── Motor.java            # Land Asset Class (Optimized for Motorcycle profiles)
    ├── Airplane.java         # Air Asset Class (Dynamically adapts for Commercial and Private Jet profiles)
    ├── Boat.java             # Water Asset Class (Base marine profile configuration)
    ├── Yacht.java            # Water Asset Class (High-end luxury marine configuration)
    └── Jetski.java           # Water Asset Class (High-speed recreational marine configuration)

```
## 🎯 OOP Concepts Demonstrated

### V1.0 & V2.0: Classes, Objects, & Encapsulation
* **Classes & Objects:** The system uses a blueprint class (`Vehicle`) to instantiate real-world objects. In `Main.java` (Lines 15-21), we create instances of these child objects using the `new` keyword and store them in a shopping cart.
* **Encapsulation:** Data security is maintained by hiding fields. In the `Vehicle.java` class, attributes like `brand` and `dailyRate` are marked as `private`. They can only be accessed or modified through public getters and setters (e.g., `getBrand()` and `setDailyRate()`), adhering strictly to Java encapsulation rules.

### V3.0: Inheritance
* **IS-A Relationship:** The project demonstrates inheritance using the `extends` keyword. We have specialized vehicle subclasses: `Car.java`, `Motor.java`, `Airplane.java`, `Boat.java`, `Yacht.java`, and `Jetski.java`.
* All subclasses inherit the base properties and methods from the parent `Vehicle.java` class (e.g., a Car *IS-A* Vehicle). They utilize the `super()` keyword within their constructors to efficiently initialize parent fields.

### V4.0: Polymorphism
This project heavily utilizes runtime polymorphism to make the code flexible and scalable:
* **Method Overloading:** The `Vehicle.java` class implements method overloading via constructor overloading, allowing objects to be instantiated with different parameters depending on context.
* **Method Overriding:** The base `calculateRentalCost()` method in `Vehicle.java` is overridden in the subclasses. For instance, `Car.java` overrides it to add an insurance premium, while `Airplane.java` overrides it to add an airport gate fee.
* **Upcasting & Dynamic Method Dispatch:** In `Main.java` (Line 67), an `ArrayList<Vehicle>` (Parent reference) is used to store multiple child objects dynamically. During checkout, a loop calls `calculateRentalCost()` on every item. Because of dynamic method dispatch, the Java Virtual Machine (JVM) automatically determines which specific overridden method to run based on the object's actual type at runtime.

## 🚀 How to Run the Program

### Prerequisites
* Java Development Kit (JDK) installed.
* A terminal, command prompt, or IDE (like VS Code).

### Execution Steps
1. Open your terminal and navigate to the root folder of this project (`MVP`).
2. Compile all the Java files across your packages by running:
   ```bash
   javac main/Main.java vehicles/*.java
3. Run the program by executing the main class within its package path:
   ```bash
   java main.Main
