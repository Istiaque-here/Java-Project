package welcome;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Welcome extends JFrame
{
    JPanel panel_1, panel_2; JButton b1, b2, b3; ImageIcon ic; String path; JLabel l1;
    Welcome()
    {
        //JFrame sizing and positioning
        setTitle("Welcome");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        //Panel1 sizing and positioning
        panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBounds(0,0,300,400);
        //path = "C:\\Users\\Istiaque Khalique\\Documents\\Medical Management System\\src\\images\\sip.jpg";
        ic = new ImageIcon(new ImageIcon(getClass().getResource("/images/sip.jpg")).getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH));
        l1 = new JLabel(ic);
        l1.setBounds(0,0,300,400);
        panel_1.add(l1);
        add(panel_1);

        //Panel2 sizing and positioning
        panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(300,0,200,400);
        panel_2.setBackground(Color.LIGHT_GRAY);
        
        //Panel2 components
        b1 = new JButton("LogIn");
        b1.setBounds(50,110,80,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.GREEN);
        b1.setFocusable(false);
        b1.setFont(new Font("Dialog",Font.BOLD,15));
        panel_2.add(b1);

        b2 = new JButton("Register");
        b2.setBounds(40,160,100,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLUE);
        b2.setFocusable(false);
        b2.setFont(new Font("Dialog",Font.BOLD,15));
        panel_2.add(b2);

        b3 = new JButton("Bloodbank");
        b3.setBounds(35,315,112,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.RED);
        b3.setFocusable(false);
        b3.setFont(new Font("Dialog",Font.BOLD,15));
        panel_2.add(b3);

        add(panel_2);

        b1.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new LogIn();
            }
        });

        b2.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new RegHome();
            }
        });

        b3.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new Bloodbank();
            }
        });

        setVisible(true);
    }
}
