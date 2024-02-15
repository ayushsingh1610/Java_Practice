// Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
import java.util.*;
class code01 extends Thread
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        code01 thread = new code01();
        thread.start();
    }
    public void run()
    {
        System.out.println("Hello, World!");
    }
}