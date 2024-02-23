// Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
import java.util.*;
class Employee
{
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public double getEmp_salary() {
        return emp_salary;
    }
    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }
}
public class code04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee ob = new Employee();
        System.out.print("Enter the name = " );
        String name = sc.nextLine();
        System.out.print("Enter the ID = ");
        int id = sc.nextInt();
        System.out.print("Enter the salary = ");
        double salary = sc.nextDouble();

        ob.setEmp_id(id);
        ob.setEmp_name(name);
        ob.setEmp_salary(salary);

        System.out.println("Press 1 for Employee ID \nPress 2 for employee Name\nPress 3 for employee salary");
        System.out.print("Enter your choice = ");
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("Employee's ID is = " + ob.getEmp_id());
            break;

            case 2:
            System.out.println("Employee's name is = " + ob.getEmp_name());
            break;

            case 3:
            System.out.println("Employee's Salary is = " + ob.getEmp_salary());
            break;

            default:
            System.out.println("Invalid choice.");
        }
        
    }
}