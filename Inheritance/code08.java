// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
class Person {
    String name = "Ayush Singh";

    String getFirstName(){
        return "";
    }
    String getLastName(){
        return "";
    }
}
class Employee extends Person{
    String getLastName(){
        return "Singh";
    }
    int getEmployeeId(){
        return 101;
    }
}

public class code08 {
    public static void main(String[] args) {
        Employee e = new Employee();

        System.out.println("Last name of Employee = " + e.getLastName());
        System.out.println("Employee ID of employee = " + e.getEmployeeId());
    }
}
