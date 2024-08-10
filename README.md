# Spring Framework Unit 1 - CMP508 University
This repository contains various examples demonstrating the use of Spring Framework for Dependency Injection. Each example corresponds to a specific question and showcases different aspects of Spring's IoC container.

## Questions and Outputs

1. Write a code to display "Rollno and StudentName" using spring framework.
```java
Output:
Rollno: 22000214
Student Name: Abhiraj
```
Link to Files:
- [Student.java](src/main/java/question_1/Student.java)
- [Main.java](src/main/java/question_1/Main.java)
- [applicationContext.xml](src/main/resources/question_1/applicationContext.xml)
---

2. Write a code to display "EmpName" using by BeanFactory and ApplicationContext of spring 10C Container.
```java
Output:
Employee Name: Abhiraj Chaudhuri
```
Link to Files:
- [Employee.java](src/main/java/question_2/Employee.java)
- [Main.java](src/main/java/question_2/Main.java)
- [applicationContext.xml](src/main/resources/question_2/applicationContext.xml)
---

3. Write a code to print employee Address detail like city state country by applying constructor injection from dependency injection of spring framework.
```java
Output:
Employee: question_3.Employee@61009542
City: Vadodara
State: Gujarat
Country: India
```
Link to Files:
- [Employee.java](src/main/java/question_3/Employee.java)
- [Address.java](src/main/java/question_3/Address.java)
- [Main.java](src/main/java/question_3/Main.java)
- [applicationContext.xml](src/main/resources/question_3/applicationContext.xml)
---

4. Write a code to print student id name answer by asking question using collection of constructor injection of spring Dependency Injection.
```java
Output:
Student ID: 22000214
Student Name: Abhiraj
Question ID: 1
Question: What is Java?
Answers: [Programming Language, Platform, Both]
Question ID: 2
Question: What is Spring?
Answers: [Framework, Library, Both]
```
Link to Files:
- [Student.java](src/main/java/question_4/Student.java)
- [Main.java](src/main/java/question_4/Main.java)
- [applicationContext.xml](src/main/resources/question_1/applicationContext.xml)
---

5. Write a code to print id ‚question and answer of question using Map method of constructor injection of spring Dependency injection.
```java
Output:
Question ID: 1
Question: What is your name?
Answer: Abhiraj Chaudhuri
Question ID: 2
Question: What is your age?
Answer: 20 years
```
Link to Files:
- [Question.java](src/main/java/question_5/Question.java)
- [QuestionMap.java](src/main/java/question_5/QuestionMap.java)
- [Main.java](src/main/java/question_5/Main.java)
- [applicationContext.xml](src/main/resources/question_5/applicationContext.xml)
---

6. Write a code to print employee id name and address using by constructor injection apply on inheriting bean class of spring Dependency injection
```java
Output:
Employee ID: 214
Employee Name: Abhie
City: Vadodara
State: GUJ
Country: INDIA
```
Link to Files:
- [Address.java](src/main/java/question_6/Address.java)
- [Employee.java](src/main/java/question_6/Employee.java)
- [Manager.java](src/main/java/question_6/Manager.java)
- [Main.java](src/main/java/question_6/Main.java)
- [applicationContext.xml](src/main/resources/question_6/applicationContext.xml)
---

7. Write a code to print employee Address detajl like city state country by applying setter injection from dependency injection of spring framework.
```java
Output:
City: Mumbai
State: Maharashtra
Country: India
```
Link to Files:
- [Address.java](src/main/java/question_7/Address.java)
- [Employee.java](src/main/java/question_7/Employee.java)
- [Main.java](src/main/java/question_7/Main.java)
- [applicationContext.xml](src/main/resources/question_7/applicationContext.xml)
---

8. Write a code to print student id name answer by asking question using collection of setter injection of spring Dependency Injection.
```java
Output:
Student ID: 22000214
Student Name: Abhiraj
Question ID: 1
Question: What is NLP?
Answers: [Natural Language Processing, Neural Language Processing, Both]
Question ID: 2
Question: What is AI?
Answers: [Artificial Intelligence, Machine Learning, Data Science]
```
Link to Files:
- [Question.java](src/main/java/question_8/Question.java)
- [Student.java](src/main/java/question_8/Student.java)
- [Main.java](src/main/java/question_8/Main.java)
- [applicationContext.xml](src/main/resources/question_8/applicationContext.xml)
---

9. Write a code to print id question and answer of question using Map method of setter injection of spring Dependency injection.
```java
Output:
Question ID: 1
Question: What is NLP?
Answer: Natural Language Processing
Question ID: 2
Question: What is Word2Vec?
Answer: Word to Vector
```
Link to Files:
- [Question.java](src/main/java/question_9/Question.java)
- [QuestionMap.java](src/main/java/question_9/QuestionMap.java)
- [Main.java](src/main/java/question_9/Main.java)
- [applicationContext.xml](src/main/resources/question_9/applicationContext.xml)
---

10. Write a code to print employee name and display name related employee department information using "byName" autowiring mode of spring framework.
```java
Output:
Employee Name: Abhieeeee
Department Name: IT
```
Link to Files:
- [Department.java](src/main/java/question_10/Department.java)
- [Employee.java](src/main/java/question_10/Employee.java)
- [Main.java](src/main/java/question_10/Main.java)
- [applicationContext.xml](src/main/resources/question_10/applicationContext.xml)
---

11. Write a code to print employee name and display name related employee department information using "by/Type" autowiring mode of spring framework.
```java
Output:
Employee Name: Abhieeeeeeeeee
Department Name: IT
```
Link to Files:
- [Department.java](src/main/java/question_11/Department.java)
- [Employee.java](src/main/java/question_11/Employee.java)
- [Main.java](src/main/java/question_11/Main.java)
- [applicationContext.xml](src/main/resources/question_11/applicationContext.xml)
---

12. Write a code to print employee name and display name related employee department information using "constructor" autowiring mode of spring framework.
```java
Output:
Employee Name: Abhie.constructor
Department Name: IT
```
Link to Files:
- [Department.java](src/main/java/question_12/Department.java)
- [Employee.java](src/main/java/question_12/Employee.java)
- [Main.java](src/main/java/question_12/Main.java)
- [applicationContext.xml](src/main/resources/question_12/applicationContext.xml)
---

13. Write a code to print employee name and display name related employee department information using "autodetect" autowiring mode of spring framework.
```java
Output:
Employee Name: Abhie.autodetect
Department Name: IT
```
Link to Files:
- [Department.java](src/main/java/question_13/Department.java)
- [Employee.java](src/main/java/question_13/Employee.java)
- [Main.java](src/main/java/question_13/Main.java)
- [applicationContext.xml](src/main/resources/question_13/applicationContext.xml)
---

14. Write a code to manage a library system where you can add books, list all books, and search for a book by its title using Spring framework with annotation-based configuration. Use @Autowired for dependency injection and @Component for bean definition.
```java
Output:
All Books in the Library:
Title: Deep Learning in Practice, Author: Mehdi Ghayoumi
Title: Atomic Habits, Author: James Clear
Enter the title of the book to search: **Deep Learning in Practice**
Book found: Title: Deep Learning in Practice, Author: Mehdi Ghayoumi
```
Link to Files:
- [Book.java](src/main/java/question_14/Book.java)
- [Library.java](src/main/java/question_14/Library.java)
- [Main.java](src/main/java/question_14/Main.java)
- [applicationContext.xml](src/main/resources/question_14/applicationContext.xml)
---


## Directory Structure

```
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── question_1
│   │   │   │   ├── Main.java
│   │   │   │   └── Student.java
│   │   │   ├── question_2
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_3
│   │   │   │   ├── Address.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_4
│   │   │   │   ├── Main.java
│   │   │   │   └── Student.java
│   │   │   ├── question_5
│   │   │   │   ├── Question.java
│   │   │   │   ├── QuestionMap.java
│   │   │   │   └── Main.java
│   │   │   ├── question_6
│   │   │   │   ├── Address.java
│   │   │   │   ├── Employee.java
│   │   │   │   ├── Manager.java
│   │   │   │   └── Main.java
│   │   │   ├── question_7
│   │   │   │   ├── Address.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_8
│   │   │   │   ├── Question.java
│   │   │   │   ├── Student.java
│   │   │   │   └── Main.java
│   │   │   ├── question_9
│   │   │   │   ├── Question.java
│   │   │   │   ├── QuestionMap.java
│   │   │   │   └── Main.java
│   │   │   ├── question_10
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_11
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_12
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_13
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_14
│   │   │   │   ├── Book.java
│   │   │   │   ├── Library.java
│   │   │   │   └── Main.java
│   │   └── resources
│   │       ├── question_1
│   │       │   └── applicationContext.xml
│   │       ├── question_2
│   │       │   └── applicationContext.xml
│   │       ├── question_3
│   │       │   └── applicationContext.xml
│   │       ├── question_4
│   │       │   └── applicationContext.xml
│   │       ├── question_5
│   │       │   └── applicationContext.xml
│   │       ├── question_6
│   │       │   └── applicationContext.xml
│   │       ├── question_7
│   │       │   └── applicationContext.xml
│   │       ├── question_8
│   │       │   └── applicationContext.xml
│   │       ├── question_9
│   │       │   └── applicationContext.xml
│   │       ├── question_10
│   │       │   └── applicationContext.xml
│   │       ├── question_11
│   │       │   └── applicationContext.xml
│   │       ├── question_12
│   │       │   └── applicationContext.xml
│   │       ├── question_13
│   │       │   └── applicationContext.xml
│   │       └── question_14
│   │           └── applicationContext.xml
└── .gitignore
```
