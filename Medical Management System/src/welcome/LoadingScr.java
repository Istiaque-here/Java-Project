package welcome;

import java.awt.*;
import javax.swing.*;

public class LoadingScr extends JFrame
{
    //Object and variables used in welcome page
    JWindow welpg; JProgressBar pb; int cnt; ImageIcon ic; JLabel lb; String ip;

    public LoadingScr()
    {
        //Welcome page and image sizing and positioning
        welpg = new JWindow();
        welpg.setSize(500,400);
        welpg.setLocationRelativeTo(null);
        welpg.setLayout(null);
        ip = "C:\\Users\\Istiaque Khalique\\Documents\\Java Project Images\\wpi.jpeg";
        ic = new ImageIcon(new ImageIcon(ip).getImage().getScaledInstance(500, 380, Image.SCALE_SMOOTH));
        lb = new JLabel(ic);
        lb.setBounds(0,0,500,380);
        welpg.add(lb);
        welpg.setVisible(true);

        //Progress bar sizing and positioning
        pb = new JProgressBar(0,100);
        pb.setBounds(0,380,500,20);
        pb.setForeground(Color.GREEN);
        pb.setBackground(Color.WHITE);
        pb.setFont(new Font("Dialog",Font.BOLD,15));
        pb.setStringPainted(true);
        welpg.add(pb);
        counterMethod();
        welpg.dispose();
        new Welcome();
    }
    public void counterMethod()
    {
        cnt = 0;
        while(cnt <= 100)
        {
            pb.setValue(cnt);
            try
            {
                Thread.sleep(80);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            cnt++;
        }
    }
}
