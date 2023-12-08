// Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
abstract class Employee
{
    abstract void calculateSalary();
    abstract void displayInfo();
}
class Manager extends Employee{
    int balance =0;
    int hr = 2000, da = 5000;
    int basic = 1000000;
    void calculateSalary(){
        balance = hr + basic + da;
    }
    void displayInfo(){
        System.out.println("The balance is = " + balance);
    }
}
class Programmer extends Employee{
    int balance =0;
    int hr = 2000, da =2000, basic = 100000;

    void calculateSalary(){
        balance = hr + da + basic;
    }
    void displayInfo(){
        System.out.println("The Balance is = " + balance);
    }
}
class code05 {
    public static void main(String[] args) {
        Manager m = new Manager();
        Programmer p = new Programmer();

        m.calculateSalary();
        m.displayInfo();

        p.calculateSalary();
        p.displayInfo();
    }
}
