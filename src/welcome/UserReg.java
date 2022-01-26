package welcome;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UserReg extends JFrame
{
    JLabel sl, nl, pl, cpl, ml, el, dobl, bgl, ldl, addl; JTextField name, mob, email, dob, bg, ld, address; JButton b1, b2;
    ImageIcon ic; String path, path1; JPasswordField passField, cpassField;
    JComboBox bloBox, lastdonday, lastdonmonth, lastdonyear, dobday, dobmon, dobyear, divBox, disBox;
    String bloodgrp[] = {"Select","A+","B+","AB+","O+","A-","B-","AB-","O-"};
    String day[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String month[] = {"Month","1","2","3","4","5","6","7","8","9","10","11","12"};
    String year[] = {"Year","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980",
    "1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997",
    "1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",};
    String division[] = {"Select Division","Barisal","Chittagong","Dhaka","Khulna","Mymensingh","Rajshahi","Rangpur","Sylhet"};
    String district[] = {"Select District"};

    UserReg()
    {
        setTitle("User Registration");
        setSize(500,520);
        setLayout(null);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        //Frame components
        sl = new JLabel("User Registration");
        sl.setBounds(170,5,160,30);
        sl.setFont(new Font("Dialog",Font.BOLD,18));
        add(sl);

        //Name label and textfield
        nl = new JLabel("Name");
        nl.setBounds(100,100,50,25);
        nl.setFont(new Font("Dialog",Font.BOLD,15));
        add(nl);

        name = new JTextField();
        name.setBounds(150,100,260,25);
        add(name);

        //Password label and passwordfield
        pl = new JLabel("Password");
        pl.setBounds(70,135,70,25);
        pl.setFont(new Font("Dialog",Font.BOLD,15));
        add(pl);

        passField = new JPasswordField();
        passField.setBounds(150,135,260,25);
        add(passField);

        //Confirm password label and passwordfield
        cpl = new JLabel("Confirm Password");
        cpl.setBounds(10,170,140,25);
        cpl.setFont(new Font("Dialog",Font.BOLD,15));
        add(cpl);

        cpassField = new JPasswordField();
        cpassField.setBounds(150,170,260,25);
        add(cpassField);

        //Email label and textfield
        el = new JLabel("Email");
        el.setBounds(100,205,40,25);
        el.setFont(new Font("Dialog",Font.BOLD,15));
        add(el);

        email = new JTextField();
        email.setBounds(150,205,260,25);
        add(email);

        //Mobile label and textfield
        ml = new JLabel("Phone");
        ml.setBounds(92,240,60,25);
        ml.setFont(new Font("Dialog",Font.BOLD,15));
        add(ml);

        mob = new JTextField();
        mob.setBounds(150,240,260,25);
        add(mob);

        //Blood group label and combobox
        bgl = new JLabel("Blood Group");
        bgl.setBounds(45,275,100,25);
        bgl.setFont(new Font("Dialog",Font.BOLD,15));
        add(bgl);

        bloBox = new JComboBox(bloodgrp);
        bloBox.setBounds(150,275,80,25);
        add(bloBox);

        //Last donation label and combobox
        ldl = new JLabel("Last Donation");
        ldl.setBounds(37,310,100,25);
        ldl.setFont(new Font("Dialog",Font.BOLD,15));
        add(ldl);

        lastdonday = new JComboBox(day);
        lastdonday.setBounds(150,310,65,25);
        add(lastdonday);

        lastdonmonth = new JComboBox(month);
        lastdonmonth.setBounds(220,310,65,25);
        add(lastdonmonth);

        lastdonyear = new JComboBox(year);
        lastdonyear.setBounds(290,310,90,25);
        add(lastdonyear);

        //DOB label and combobox
        dobl = new JLabel("Date of Birth");
        dobl.setBounds(45,345,100,25);
        dobl.setFont(new Font("Dialog",Font.BOLD,15));
        add(dobl);

        dobday = new JComboBox(day);
        dobday.setBounds(150,345,65,25);
        add(dobday);

        dobmon = new JComboBox(month);
        dobmon.setBounds(220,345,65,25);
        add(dobmon);

        dobyear = new JComboBox(year);
        dobyear.setBounds(290,345,90,25);
        add(dobyear);

        //Address label and combobox
        addl = new JLabel("Address");
        addl.setBounds(75,380,70,25);
        addl.setFont(new Font("Dialog",Font.BOLD,15));
        add(addl);

        divBox = new JComboBox(division);
        divBox.setBounds(150,380,130,25);
        add(divBox);

        disBox = new JComboBox(district);
        disBox.setBounds(285,380,160,25);
        add(disBox);

        //Back button
        ic = new ImageIcon(new ImageIcon(getClass().getResource("/images/bb1.png")).getImage().getScaledInstance(35,25, Image.SCALE_SMOOTH));
        b1 = new JButton(ic);
        b1.setBounds(10,445,35,25);
        b1.setFocusable(false);
        add(b1);

        //Register button
        ic = new ImageIcon(new ImageIcon(getClass().getResource("/images/regb.png")).getImage().getScaledInstance(100, 25, Image.SCALE_SMOOTH));
        b2 = new JButton(ic);
        b2.setBounds(310,415,100,25);
        b2.setFocusable(false);
        add(b2);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new RegHome();
            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });

        setVisible(true);
    }
}
