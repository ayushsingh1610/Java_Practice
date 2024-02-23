// Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.
import java.util.*;
class Car 
{
    private String company_name, model_name;
    private int year;
    private double mileage;

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getMileage() {
        return mileage;
    }
}
public class code06
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Car ob = new Car();
        System.out.print("Enter the company name = ");
        String company_name = sc.nextLine();
        System.out.print("Enter the Model name = ");
        String model_name = sc.nextLine();
        System.out.print("Enter the year = ");
        int year = sc.nextInt();
        System.out.print("Enter the mileage = ");
        int mileage = sc.nextInt();

        ob.setCompany_name(company_name);
        ob.setModel_name(model_name);
        ob.setYear(year);
        ob.setMileage(mileage);


        System.out.println("Mileage = " + ob.getMileage());
    }
}