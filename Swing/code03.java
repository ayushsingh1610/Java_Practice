import javax.swing.*;
import java.util.*;
import java.awt.*;  
import java.awt.event.*;  
public class code03 implements ActionListener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        JFrame f = new JFrame("Form page");
        JLabel l1 = new JLabel("Name");
        l1.setBounds(20, 70, 80, 25);

        JLabel l2 = new JLabel("Age");
        l2.setBounds(20, 120, 80, 25);

        JTextField name = new JTextField();
        name.setBounds(80, 70, 100, 25);

        JTextField age = new JTextField();
        age.setBounds(80, 120, 100, 25);

        JButton button = new JButton("Submit");
        button.setBounds(60, 170, 80, 25);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                JLabel text = new JLabel();
                text.setText("Eligible to Vote");  
        }
        });
        f.add(l1);
        f.add(l2);
        f.add(name);
        f.add(age);
        f.add(button);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
      
    
}
