# Day 02: Mistakes & Core Standard Corrections

During the review of Day 01, several deviations from Java coding standards and general development best practices were identified. The following table summarizes these mistakes and how they have been corrected in Day 02.

| # | Mistake Found in Day 01 | Impact / Issue | Corrected Standard in Day 02 |
|---|-------------------------|----------------|------------------------------|
| **1** | **Hardcoded Field Values** (e.g., `String name = "naik";` inside class definition) | Every object instantiated gets the same values, breaking the purpose of object-oriented programming. | **Used Parameterized Constructors** to dynamically initialize unique fields for each object. |
| **2** | **Lowercase Class Names** (e.g., `public class student`) | Violates Java Naming Conventions. Classes should be in PascalCase. | **Renamed classes** to start with capital letters (`Student`, `Employee`, etc.). |
| **3** | **Lowercase Folder Names** (e.g., `/day1` and `/day2`) | Mismatches the repository design schema (`/Day01`, `/Day02`, etc.) defined in the README. | **Renamed folders** to CamelCase/PascalCase matching the standard (`Day01`, `Day02`). |
| **4** | **Committing Compiled Class Files** (e.g., `Book.class` in version control) | Bloats the repository and causes conflicts. Binaries/build outputs should never be tracked. | **Deleted all `.class` files** and added a `.gitignore` file to ignore compiled outputs. |
| **5** | **Hardcoded output statements** (e.g., printing static text in methods) | Methods printed static text rather than referring to the instantiated object's unique fields. | **Modified methods** to dynamically reference class fields (e.g. `System.out.println(name + " is studying.");`). |
