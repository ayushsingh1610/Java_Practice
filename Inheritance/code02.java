// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

class Employee {
    void display() {

    }
}

class Manager extends Employee {

    String name = "Ayush";
    String add = "Farrukhabad";
    double salary = 100000;
    String jobtittle = "Developer";

    double bonus(double salary) {
        return 0.2 * salary;
    }

    void display() {
        System.out.println("Name of Employee = " + name);
        System.out.println("Address of Employee =  " + add);
        System.out.println("Job Tittle of Employee = " + jobtittle);
        System.out.println("Salary of Employee = " + salary);
        System.out.println("Bonus of Employee = " + bonus(salary));
    }
}

class code02 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}
