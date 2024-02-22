// Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
import java.util.*;
class Person 
{
    private String name;
    private int age;
    private String country;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()     {return  age;}
    public void setAge(int age)    { this.age = age; }

    public String getCountry()      {return country;}
    public void setCountry(String country)        { this.country = country; }
}
public class code01
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Person ob = new Person();
        System.out.print("Enter the name = ");
        String name = sc.nextLine();
        System.out.print("Enter the country = ");
        String country = sc.nextLine();
        System.out.print("Enter the age = ");
        int age = sc.nextInt();
        
        ob.setName(name);
        ob.setAge(age);
        ob.setCountry(country);
        System.out.println("\nPress 1 for name\nPress 2 for Age\nPress 3 for country.");
        System.out.print("Enter your choice = ");
        
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("Person's name is = " + ob.getName());
            break;

            case 2:
            System.out.println("Person's age is = " + ob.getAge());
            break;

            case 3:
            System.out.println("Person's country is = " + ob.getCountry());
            break;

            default:
            System.out.println("Invalid choice.");
        }

    }
}