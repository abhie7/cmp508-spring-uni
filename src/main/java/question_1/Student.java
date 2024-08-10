//1. Write a code to display "Rollno and StudentName" using spring framework.
//2. Write a code to display "EmpName" using by BeanFactory and ApplicationContext of spring 10C Container.
//3. Write a code to print employee Address detail like city state country by applying constructor injection from dependency injection of spring framework.
//4. Write a code to print student id name answer by asking question using collection of constructor injection of spring Dependency Injection.
//5. Write a code to print id ‚question and answer of question using Map method of constructor injection of spring Dependency injection.
//6. Write a code to print employee id name and address using by constructor injection apply on inheriting bean class of spring Dependency injection
//7. Write a code to print employee Address detajl like city state country by applying setter injection from dependency injection of spring framework.
//8. Write a code to print student id name answer by asking question using collection of setter injection of spring Dependency Injection.
//9. Write a code to print id question and answer of question using Map method of setter injection of spring Dependency injection.
//10. Write a code to print employee name and display name related employee department information using "byName" autowiring mode of spring framework.
//11. Write a code to print employee name and display name related employee department information using "by/Type" autowiring mode of spring framework.
//12. Write a code to print employee name and display name related employee department information using "constructor" autowiring mode of spring framework.
//13. Write a code to print employee name and display name related employee department information using "autodetect" autowiring mode of spring framework.

package question_1;

public class Student {
    private int rollno;
    private String name;

    // Getters and Setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

