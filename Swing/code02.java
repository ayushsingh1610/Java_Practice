// Creating a text Field.
import java.util.*;
import javax.swing.*;
public class code02
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        JFrame f = new JFrame("Text Field Example");

        JTextField t1, t2;
        t1 = new JTextField();
        t1.setBounds(100,50,100, 40);
        t2 = new JTextField();
        t2.setBounds(100,100,100, 40);

        f.add(t1);
        f.add(t2);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}