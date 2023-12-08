// Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
class Employee{
    int calculateSalary(){
        return 0;
    }
}
class Manager extends Employee{
    int calculateSalary(){
        return 200000;
    }
}
class Programmer extends Employee{
    int calculateSalary(){
        return 100000;
    }
}

public class code04 {
    public static void main(String[] args) {
        Manager m = new Manager();
        Programmer p = new Programmer();
        System.out.println("Manager salary = " + m.calculateSalary());
        System.out.println("Programmer salary = " + p.calculateSalary());
    }
    
}
