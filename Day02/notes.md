# Day 02 Notes: Objects, Parameterized Constructors, and Naming Conventions

Today, we built upon Day 01 concepts (Classes and Entities) by solving the fundamental limitations of static/hardcoded attributes and improving the design structure of our Java programs.

## Key Concepts Covered

### 1. Object-Oriented Initialization (Avoid Hardcoding)
*   **The Problem:** In Day 01, variables inside classes like `student` were assigned hardcoded values (e.g., `String name = "naik"`). This meant every instance of that class had identical attributes.
*   **The Solution:** Use **Constructors** to dynamically initialize instance variables when an object is created.

### 2. Constructors in Java
A constructor is a special block of code similar to a method that is called when an instance of an object is created.
*   **Properties of Constructors:**
    *   Must have the **exact same name** as the class.
    *   Must **not have a return type** (not even `void`).
    *   It is invoked implicitly using the `new` keyword.

#### Default (No-Argument) Constructor
If no constructor is defined in a class, the Java compiler automatically inserts a default no-argument constructor that initializes fields to their default values (e.g., `null` for objects, `0` for numeric types).

#### Parameterized Constructor
A constructor that accepts arguments to initialize instance variables with custom values at the time of object instantiation.
```java
public class Student {
    String name;
    
    // Parameterized Constructor
    public Student(String name) {
        this.name = name; // Initializes instance variable with parameter value
    }
}
```

### 3. The `this` Keyword
*   Used to refer to the current object's instance variables.
*   It resolves naming conflicts (shadowing) when the constructor's parameters have the same name as the class's fields.
    *   `this.name` refers to the class instance field `name`.
    *   `name` refers to the parameter passed to the constructor.

### 4. Java Naming Conventions
*   **Class Names:** Must start with a Capital letter and use PascalCase (e.g., `Student` instead of `student`, `Employee` instead of `employee`).
*   **Method and Variable Names:** Must start with a lowercase letter and use camelCase (e.g., `rollNo`, `submitAssignment()`).
*   **Package Names:** Should be all lowercase, but within structured directories, match the logical folder layout (e.g., `Day02` to match `/Day02`).
