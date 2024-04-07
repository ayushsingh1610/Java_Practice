import java.util.*;
import Bank.*;
public class code01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input ob = new input();
        ob.getInfo();
        ob.show();
        calculate calc = new calculate(ob.amount);
        choice ch = new choice();
        ch.run();
    }  
}