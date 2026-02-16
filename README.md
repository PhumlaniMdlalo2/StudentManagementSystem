# Student-Management-System
Student Management System demonstrating Builder Pattern, Inheritance, Polymorphism, and SOLID principles in Java. Manages different student types with flexible object creation and extensible design.

SOLID Principles Applied:
1. Single Responsibility Principle (SRP)
   
Definition: A class should have only one reason to change, meaning it should have only one job or responsibility.

Implementation in this project:

Student class: Responsible only for defining the common structure and behavior of all students. It doesn't handle student creation, data persistence, or business logic calculations.

UndergraduateStudent and GraduateStudent classes: Each is responsible for its own specific student type behavior, including its unique tuition calculation logic. For example:

UndergraduateStudent handles credit-hour-based tuition calculation

GraduateStudent handles fixed tuition with stipend deductions

Builder classes: Each Builder (nested within student classes) has a single responsibility - constructing student objects with optional parameters. It doesn't handle validation, display, or calculation logic.

2. Open/Closed Principle (OCP)

Definition: Software entities should be open for extension but closed for modification.

Implementation in this project:

The Student abstract class defines a contract that can be extended without modifying existing code. When we need to add a new student type (e.g., PartTimeStudent), we simply create a new class that extends Student.

No modification needed to existing classes: Adding a new student type doesn't require changes to UndergraduateStudent, GraduateStudent, or the base Student class.

Design Patterns Used

Builder Pattern

The Builder pattern is used to construct student objects with many optional parameters, making the code more readable and maintainable.

Benefits:

- Handles multiple optional parameters elegantly

- Immutable objects (fields are set only during construction)

- Readable method chaining

- No need for multiple constructors
