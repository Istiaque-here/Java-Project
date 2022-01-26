package welcome;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AuthReg extends JFrame
{
    JLabel fl,ownernl,hnl,nobl,typel,deptnol,emaill,pl,asl,divl,disl;
    JButton back, reg;
    ImageIcon ic;
    String path_b, path_reg;
    JTextField ownername,hname,nob,deptno,email,pn,as; JComboBox cb; String type[] = {"","Public","Private"};
    String str[] = {"","Yes","No"};
    String division[] = {"","Barisal","Chittagong","Dhaka","Khulna","Mymensingh","Rajshahi","Rangpur","Sylhet"};
    
    AuthReg()
    {
        setTitle("Authority Registration");
        setSize(500,530);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        //Setting frame components
        fl = new JLabel("Authority Registration");
        fl.setBounds(140,5,280,50);
        fl.setFont(new Font("Monospace",Font.BOLD,20));
        add(fl);

        //Owner name label and textfield
        ownernl = new JLabel("Owner Name");
        ownernl.setBounds(50,70,100,20);
        ownernl.setFont(new Font("Dialog",Font.BOLD,15));
        add(ownernl);

        ownername = new JTextField();
        ownername.setBounds(160,70,260,20);
        add(ownername);

        //Hospital name label and textfield
        hnl = new JLabel("Hospital Name");
        hnl.setBounds(38,100,120,20);
        hnl.setFont(new Font("Dialog",Font.BOLD,15));
        add(hnl);

        hname = new JTextField();
        hname.setBounds(160,100,260,20);
        add(hname);

        //Number pf bed label and textfield
        nobl = new JLabel("Total Seat");
        nobl.setBounds(65,130,90,20);
        nobl.setFont(new Font("Dialog",Font.BOLD,15));
        add(nobl);

        nob = new JTextField();
        nob.setBounds(160,130,260,20);
        add(nob);

        //Public/private
        typel = new JLabel("Type");
        typel.setBounds(100,160,80,20);
        typel.setFont(new Font("Dialog",Font.BOLD,15));
        add(typel);

        cb = new JComboBox(type);
        cb.setBounds(160,160,100,20);
        add(cb);

        //Department label and textfield
        deptnol = new JLabel("Department No.");
        deptnol.setBounds(25,190,150,20);
        deptnol.setFont(new Font("Dialog",Font.BOLD,15));
        add(deptnol);

        deptno = new JTextField();
        deptno.setBounds(160,190,260,20);
        add(deptno);

        //Email label and textfield
        emaill = new JLabel("Email");
        emaill.setBounds(100,220,80,20);
        emaill.setFont(new Font("Dialog",Font.BOLD,15));
        add(emaill);

        email = new JTextField();
        email.setBounds(160,220,260,20);
        add(email);

        //Phone
        pl = new JLabel("Phone");
        pl.setBounds(90,250,90,20);
        pl.setFont(new Font("Dialog",Font.BOLD,15));
        add(pl);

        pn = new JTextField();
        pn.setBounds(160,250,260,20);
        add(pn);

        //Ambulance service
        asl = new JLabel("Ambulance Service");
        asl.setBounds(5,280,180,20);
        asl.setFont(new Font("Dialog",Font.BOLD,15));
        add(asl);

        cb = new JComboBox(str);
        cb.setBounds(160,280,70,20);
        add(cb);

        //Division label and textfield
        divl = new JLabel("Division");
        divl.setBounds(80,310,80,20);
        divl.setFont(new Font("Dialog",Font.BOLD,15));
        add(divl);

        cb = new JComboBox(division);
        cb.setBounds(160,310,120,20);
        add(cb);

        //District label and textfield
        divl = new JLabel("District");
        divl.setBounds(80,340,80,20);
        divl.setFont(new Font("Dialog",Font.BOLD,15));
        add(divl);

        cb = new JComboBox();
        cb.setBounds(160,340,200,20);
        add(cb);

        //Back button
        path_b = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\bb1.png";
        ic = new ImageIcon(new ImageIcon(path_b).getImage().getScaledInstance(35, 25, Image.SCALE_SMOOTH));
        back = new JButton(ic);
        back.setBounds(10,455,35,25);
        back.setFocusable(false);
        add(back);

        //Regsiter button
        path_reg = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\regb.png";
        ic = new ImageIcon(new ImageIcon(path_reg).getImage().getScaledInstance(80, 30, Image.SCALE_SMOOTH));
        reg = new JButton(ic);
        reg.setBounds(160,370,80,30);
        reg.setFocusable(false);
        add(reg);

        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new RegHome();
            }
        });

        reg.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });

        setVisible(true);
    }
}
