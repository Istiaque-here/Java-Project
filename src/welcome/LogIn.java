package welcome;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogIn extends JFrame
{
    JTextField t1; JLabel l1, l2; JButton b1, b2; ImageIcon ic; String path_b, path_s; String un;
    char[] pass;
    JPasswordField passfield;

    LogIn()
    {
        //JFrame sizing and positioning
        setTitle("Login");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        //Username label and textfield
        l1 = new JLabel("Username");
        l1.setBounds(80,80,100,30);
        l1.setFont(new Font("Dialog",Font.BOLD,17));
        add(l1);

        t1 = new JTextField();
        t1.setBounds(180,80,230,30);
        t1.setFont(new Font("Times New Roman",Font.PLAIN,14));
        add(t1);

        //Password label and passwordfield
        l2 = new JLabel("Password");
        l2.setBounds(80,130,100,30);
        l2.setFont(new Font("Dialog",Font.BOLD,17));
        add(l2);

        passfield = new JPasswordField();
        passfield.setBounds(180,130,230,30);
        add(passfield);

        //path_b = "C:\\Users\\Istiaque Khalique\\Documents\\Medical Management System\\src\\images\\bb1.png";
        ic = new ImageIcon(new ImageIcon(getClass().getResource("/images/bb1.png")).getImage().getScaledInstance(35, 25, Image.SCALE_SMOOTH));
        b1 = new JButton(ic);
        b1.setBounds(10,325,35,25);
        b1.setFocusable(false);
        add(b1);

        //path_s = "C:\\Users\\Istiaque Khalique\\Documents\\Medical Management System\\src\\images\\lb.png";
        ic = new ImageIcon(new ImageIcon(getClass().getResource("/images/lb.png")).getImage().getScaledInstance(80, 35, Image.SCALE_SMOOTH));
        b2 = new JButton(ic);
        b2.setBounds(325,180,80,35);
        b2.setFocusable(false);
        add(b2);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new Welcome();
            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((t1.getText().isEmpty()) && (passfield.getPassword() == null)) JOptionPane.showMessageDialog(null,"Empty input field!");
                else if((t1.getText().isEmpty())) JOptionPane.showMessageDialog(null,"Please enter username!"); 
                else if(passfield.getPassword() == null) JOptionPane.showMessageDialog(null,"Please enter password!");
                else
                {
                    un = t1.getText();
                    pass = passfield.getPassword();
                    dispose();
                }
            }
        });
        setVisible(true);
    }
}
