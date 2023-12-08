// Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
class Employee{
    void work(){

    }
    double getsalary(){
        return 0.0;
    }
}
class HRManager extends Employee{
    void work()
    {
        System.out.println("Hires the employee.");
    }
    void addEmployee(String n)
    {
        System.out.println("Hires a new Employeee whose name is - " + n);
    }
}
public class code05 {
    public static void main(String[] args) {
        HRManager h = new HRManager();

        h.work();
        h.addEmployee("Ayush");
    }
    
}
