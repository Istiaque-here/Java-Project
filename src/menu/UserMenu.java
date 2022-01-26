package menu;

import welcome.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UserMenu extends JFrame
{
    JButton searchbtn, doclistbtn, ambbtn, backbtn; JLabel firstlabel; String path; ImageIcon ic;

    UserMenu()
    {
        setTitle("User Menu");
        setSize(500,400);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(null);

        //Fisrt label
        firstlabel = new JLabel("User Menu");
        firstlabel.setBounds(180,10,150,60);
        firstlabel.setFont(new Font("Monospace",Font.BOLD,25));
        add(firstlabel);
        
        //Search button
        searchbtn = new JButton("Find Doctor");
        searchbtn.setBounds(185,120,120,25);
        searchbtn.setFont(new Font("Dialog",Font.BOLD,15));
        searchbtn.setFocusable(false);
        searchbtn.setForeground(Color.WHITE);
        searchbtn.setBackground(Color.BLUE);
        add(searchbtn);

        //Doctor list button
        doclistbtn = new JButton("Doctor List");
        doclistbtn.setBounds(185,155,120,25);
        doclistbtn.setFont(new Font("Dialog",Font.BOLD,15));
        doclistbtn.setFocusable(false);
        doclistbtn.setForeground(Color.BLACK);
        doclistbtn.setBackground(Color.CYAN);
        add(doclistbtn);

        //Ambulance service button
        ambbtn = new JButton("Ambulance Service");
        ambbtn.setBounds(150,190,180,25);
        ambbtn.setFont(new Font("Dialog",Font.BOLD,15));
        ambbtn.setFocusable(false);
        ambbtn.setForeground(Color.BLACK);
        ambbtn.setBackground(Color.WHITE);
        add(ambbtn);

        //Back button
        path = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\bb1.png";
        ic = new ImageIcon((new ImageIcon(path).getImage().getScaledInstance(35, 25, Image.SCALE_SMOOTH)));
        backbtn = new JButton(ic);
        backbtn.setBounds(10,325,35,25);
        backbtn.setFocusable(false);
        add(backbtn);

        //ActionListener
        searchbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });

        doclistbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });

        ambbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });

        backbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });

        setVisible(true);
    }
}
