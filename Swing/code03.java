import javax.swing.*;
import java.util.*; 
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
        
        
        final JLabel text = new JLabel() ;
        text.setBounds(50, 210, 200, 25);
        
        text.setVisible(false);
        button.addActionListener(new ActionListener() {         // Logic to display label when button is pressed.
            public void actionPerformed(ActionEvent e){  
                text.setVisible(true);    
        }
        });


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                String naam = name.getText();                   // so that we can retrieve the name from text field
                int a = Integer.parseInt(age.getText());        // so that we can retrieve the age from textField
                if(a>=18)
                {
                    text.setText(naam + " is eligible to Vote");    // so that we change the display text
                }
                else 
                {
                    text.setText(naam + " is NOT Eligible to Vote");
                }
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(name);
        f.add(age);
        f.add(button);
        f.add(text);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e);
    }
}
