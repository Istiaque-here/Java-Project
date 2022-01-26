package welcome;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bloodbank extends JFrame
{
    JLabel first_l, divl, disl, bgl; JTextField div, dis, bg; JButton search, back; ImageIcon ic; String path_s, path_b;
    String division[] = {"","Barisal","Chittagong","Dhaka","Khulna","Mymensingh","Rajshahi","Rangpur","Sylhet"};
    String bloodg[] = {"","A+","B+","AB+","O+","A-","B-","AB-","O-"};
    JComboBox cb;

    Bloodbank()
    {
        setTitle("Bloodbank");
        setSize(500,400);
        setLayout(null);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        //Setting frame components
        first_l = new JLabel("Donate blood, save life.");
        first_l.setBounds(130,10,250,50);
        first_l.setFont(new Font("Dialog",Font.BOLD,20));
        add(first_l);
        
        //Division label and combobox
        divl = new JLabel("Division");
        divl.setBounds(90,120,60,25);
        divl.setFont(new Font("Monospace",Font.BOLD,15));
        add(divl);

        cb = new JComboBox(division);
        cb.setBounds(170,120,110,25);
        add(cb);

        //District label and combobox
        disl = new JLabel("District");
        disl.setBounds(95,155,60,25);
        disl.setFont(new Font("Monospace",Font.BOLD,15));
        add(disl);

        cb = new JComboBox();
        cb.setBounds(170,155,180,25);
        add(cb);

        //Blood group label and combobox
        bgl = new JLabel("Blood group");
        bgl.setBounds(60,190,100,25);
        bgl.setFont(new Font("Monospace",Font.BOLD,15));
        add(bgl);

        cb = new JComboBox(bloodg);
        cb.setBounds(170,190,60,25);
        add(cb);

        //Back button
        //path_b = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\bb1.png";
        ic = new ImageIcon(new ImageIcon(getClass().getResource("/images/bb1.png")).getImage().getScaledInstance(35, 25, Image.SCALE_SMOOTH));
        back = new JButton(ic);
        back.setBounds(10,325,35,25);
        back.setFocusable(false);
        add(back);

        //Search button
        //path_s = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\searchb.png";
        ic = new ImageIcon(new ImageIcon(getClass().getResource("/images/searchb.png")).getImage().getScaledInstance(40, 25, Image.SCALE_SMOOTH));
        search = new JButton(ic);
        search.setBounds(170,230,40,25);
        search.setFocusable(false);
        add(search);

        back.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new Welcome();
            }
        });

        search.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
        setVisible(true);
    }
}
