import java.awt.*;
import javax.swing.*;
public class jframe{  
    public static void main(String args[]){ 
        JFrame jf=new JFrame("This is JFrame");
        JPanel h=new JPanel();
        h.setSize(100,100);

        h.add(new JButton("Button"));
        h.add(new JLabel("this is JLabel"));
        h.setBackground(Color.RED);

        jf.add(h);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }  
}