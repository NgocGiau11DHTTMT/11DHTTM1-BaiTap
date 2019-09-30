
package com.Dhttmt.tuan2;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.PopupMenu;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoBoxLayout extends JFrame {

private static Object PnBox;

    private static container getContentPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public DemoBoxLayout(){ 
super ("BoxLayout ");
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setSize(400, 300);
setVisible(true);
JPanel jpn = new JPanel(new FlowLayout());
jpn.setBackground(Color.yellow);
PopupMenu JButton = null;

jpn.add(JButton);
PopupMenu ipn = null;
add(ipn); 

}
public static void main(String[] args) {
JPanel pn = new JPanel();
JPanel pnBox = new JPanel();
pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
JButton btn1=new JButton("BoxLayout");
btn1.setForeground(Color.red);
Font font=new Font("Arial",Font.BOLD / Font.ITALIC,25);
btn1.setFont(font);pnBox.add(btn1);
JButton btn2=new JButton("X_AXIS");
btn2.setForeground(Color.BLUE);
btn2.setFont(font);pnBox.add(btn2);
JButton btn3=new JButton("Y_AXIS");
btn3.setForeground(Color.green);
btn3.setFont(font);pnBox.add(btn3);

container con=getContentPanel();
con.add(pnBox);

}
}