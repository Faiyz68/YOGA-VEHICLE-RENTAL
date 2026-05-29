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
