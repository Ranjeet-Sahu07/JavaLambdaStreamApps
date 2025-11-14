# Part A: Employee Sorting Using Lambda Expressions

## 📋 Program Objective

This program demonstrates the use of **Lambda Expressions** in Java for sorting Employee objects based on different attributes (name, age, and salary). It showcases the power and simplicity of lambda syntax compared to traditional anonymous inner classes.

## 🗂️ Files

- **Employee.java** - Employee model class with name, age, and salary fields
- **EmployeeSortingDemo.java** - Main program demonstrating various lambda sorting techniques

## 🔧 How Lambda Expressions Are Used

### 1. Basic Lambda Sorting
```java
// Sort by name (alphabetical)
employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

// Sort by age (ascending)
employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

// Sort by salary (ascending)
employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
```

### 2. Advanced Comparator Methods
```java
// Using Comparator.comparing() with method references
employees.sort(Comparator.comparing(Employee::getName));

// Reverse order using reversed()
employees.sort(Comparator.comparing(Employee::getAge).reversed());
```

## 🚀 How to Compile and Run

### Using Command Line:

```bash
# Navigate to the project directory
cd PartA_EmployeeSorting/src

# Compile the Java files
javac com/example/lambda/*.java

# Run the program
java com.example.lambda.EmployeeSortingDemo
```

### Using IDE (Eclipse/IntelliJ):

1. Import the PartA_EmployeeSorting folder as a Java project
2. Set `src` as the source folder
3. Run `EmployeeSortingDemo.java` as a Java Application

## 📊 Example Output

```
========================================
EMPLOYEE SORTING USING LAMBDA EXPRESSIONS
========================================

Original Employee List:
  Employee{name='Alice', age=30, salary=75000.00}
  Employee{name='Bob', age=25, salary=65000.00}
  Employee{name='Charlie', age=35, salary=85000.00}
  Employee{name='Diana', age=28, salary=70000.00}
  Employee{name='Eve', age=32, salary=80000.00}

1. SORTED BY NAME (Alphabetical):
  Employee{name='Alice', age=30, salary=75000.00}
  Employee{name='Bob', age=25, salary=65000.00}
  Employee{name='Charlie', age=35, salary=85000.00}
  Employee{name='Diana', age=28, salary=70000.00}
  Employee{name='Eve', age=32, salary=80000.00}

2. SORTED BY AGE (Ascending):
  Employee{name='Bob', age=25, salary=65000.00}
  Employee{name='Diana', age=28, salary=70000.00}
  Employee{name='Alice', age=30, salary=75000.00}
  Employee{name='Eve', age=32, salary=80000.00}
  Employee{name='Charlie', age=35, salary=85000.00}

3. SORTED BY SALARY (Ascending):
  Employee{name='Bob', age=25, salary=65000.00}
  Employee{name='Diana', age=28, salary=70000.00}
  Employee{name='Alice', age=30, salary=75000.00}
  Employee{name='Eve', age=32, salary=80000.00}
  Employee{name='Charlie', age=35, salary=85000.00}

4. SORTED BY SALARY (Descending):
  Employee{name='Charlie', age=35, salary=85000.00}
  Employee{name='Eve', age=32, salary=80000.00}
  Employee{name='Alice', age=30, salary=75000.00}
  Employee{name='Diana', age=28, salary=70000.00}
  Employee{name='Bob', age=25, salary=65000.00}
```

## 💡 Key Learning Points

1. **Lambda Syntax**: `(parameters) -> expression` or `(parameters) -> { statements }`
2. **Functional Interfaces**: Lambda expressions implement functional interfaces (e.g., Comparator)
3. **Method References**: Shorter syntax using `::` operator
4. **Comparator Methods**: `comparing()`, `reversed()`, `thenComparing()` for complex sorting
5. **Type Inference**: Java infers parameter types from context

## 📦 Requirements

- **JDK**: 8 or higher (Lambda expressions introduced in Java 8)
- **IDE**: Any Java IDE or text editor + command line

## 🎯 Concepts Demonstrated

- Lambda expressions for comparators
- Sorting collections with custom logic
- Method references
- Functional programming in Java
- Clean and concise code compared to anonymous classes
