package welcome;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RegHome extends JFrame
{
    JLabel l1; JButton b1, b2, b3,b4; ImageIcon ic; String path;

    RegHome()
    {
        //JFrame sizing and positioning
        setTitle("Register");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        //Frame components
        l1 = new JLabel("REGISTER");
        l1.setBounds(185,20,150,100);
        l1.setFont(new Font("Monospace",Font.BOLD,25));
        add(l1);

        b1 = new JButton("User");
        b1.setBounds(200,140,90,30);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.CYAN);
        b1.setFocusable(false);
        b1.setFont(new Font("Dialog",Font.BOLD,15));
        add(b1);

        b3 = new JButton("Authority");
        b3.setBounds(180,180,130,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.DARK_GRAY);
        b3.setFocusable(false);
        b3.setFont(new Font("Dialog",Font.BOLD,15));
        add(b3);

        path = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\bb1.png";
        ic = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(35, 25, Image.SCALE_SMOOTH));
        b4 = new JButton(ic);
        b4.setBounds(20,320,35,25);
        b4.setFocusable(false);
        add(b4);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new UserReg();
            }
        });

        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new AuthReg();
            }
        });
        
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new Welcome();
            }
        });

        setVisible(true);
    }
}
