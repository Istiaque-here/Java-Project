package welcome;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UserReg extends JFrame
{
    JLabel sl, nl, pl, cpl, ml, el, dobl, bgl, ldl, addl; JTextField name, pass, cpass, mob, email, dob, bg, ld, address; JButton b1, b2;
    ImageIcon ic; String path, path1;

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

        //Password label and textfield
        pl = new JLabel("Password");
        pl.setBounds(70,135,70,25);
        pl.setFont(new Font("Dialog",Font.BOLD,15));
        add(pl);

        pass = new JTextField();
        pass.setBounds(150,135,260,25);
        add(pass);

        //Confirm password label and textfield
        cpl = new JLabel("Confirm Password");
        cpl.setBounds(10,170,140,25);
        cpl.setFont(new Font("Dialog",Font.BOLD,15));
        add(cpl);

        cpass = new JTextField();
        cpass.setBounds(150,170,260,25);
        add(cpass);

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

        //Blood group label and textfield
        bgl = new JLabel("Blood Group");
        bgl.setBounds(45,275,100,25);
        bgl.setFont(new Font("Dialog",Font.BOLD,15));
        add(bgl);

        bg = new JTextField();
        bg.setBounds(150,275,260,25);
        add(bg);

        //Last donation label and textfield
        ldl = new JLabel("Last Donation");
        ldl.setBounds(37,310,100,25);
        ldl.setFont(new Font("Dialog",Font.BOLD,15));
        add(ldl);

        ld = new JTextField();
        ld.setBounds(150,310,260,25);
        add(ld);

        //DOB label and textfield
        dobl = new JLabel("Date of Birth");
        dobl.setBounds(45,345,100,25);
        dobl.setFont(new Font("Dialog",Font.BOLD,15));
        add(dobl);

        dob = new JTextField();
        dob.setBounds(150,345,260,25);
        add(dob);

        //Address label and textfield
        addl = new JLabel("Address");
        addl.setBounds(75,380,70,25);
        addl.setFont(new Font("Dialog",Font.BOLD,15));
        add(addl);

        address = new JTextField();
        address.setBounds(150,380,260,25);
        add(address);

        //Back button
        path = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\bb1.png";
        ic = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(35,25, Image.SCALE_SMOOTH));
        b1 = new JButton(ic);
        b1.setBounds(10,445,35,25);
        b1.setFocusable(false);
        add(b1);

        //Register button
        path1 = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\regb.png";
        ic = new ImageIcon(new ImageIcon(path1).getImage().getScaledInstance(100, 25, Image.SCALE_SMOOTH));
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
