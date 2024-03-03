// Creating a button
import java.util.*;
import javax.swing.*;
public class code01
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        JFrame f= new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(130,100,100, 40);
        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}