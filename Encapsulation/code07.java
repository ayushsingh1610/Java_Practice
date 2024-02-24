// Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.
import java.util.*;
class Student
{
    private int student_id; 
    private String  student_name;
    private int grades;

    public int getStudent_id() {
        return student_id;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public String getStudent_name() {
        return student_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public int getGrades() {
        return grades;
    }
    public void addGrade(int grades)
    {
        this.grades+=grades;
    }
}
public class code07
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name = ");
        String student_name = sc.nextLine();
        System.out.print("Enter the ID = ");
        int student_id = sc.nextInt();
        Student ob = new Student();
        ob.setStudent_id(student_id);
        ob.setStudent_name(student_name);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks to add = ");
            ob.addGrade(sc.nextInt());
        }

        System.out.println("\nThe Student ID is = " + ob.getStudent_id());
        System.out.println("The Student name is = " + ob.getStudent_name());
        System.out.println("The Grades are = " + ob.getGrades());
    }
}