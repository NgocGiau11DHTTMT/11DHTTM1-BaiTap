
package com.Dhttmt.tuan2;




import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindow extends JFrame{
    public MyWindow(){
        super("Demo Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
  public static void main(String[] args){
      
      MyWindow ui=new MyWindow();
      ui.setSize(400, 300);
      ui.setLocationRelativeTo(null);
      ui.setVisible(true);
       JPanel PnFlow = new JPanel();
      PnFlow.setLayout(new FlowLayout());
      PnFlow.setBackground(Color.PINK);
      JButton btn1=new JButton("FlowLayout");
      JButton btn2=new JButton("Add cac control");
      JButton btn3=new JButton("Trên 1 dòng");
      JButton btn4=new JButton("Hết chỗ chứa");
      JButton btn5=new JButton("Thì xuống dòng");
      
      PnFlow.add(btn1);
      PnFlow.add(btn2);
      PnFlow.add(btn3);
      PnFlow.add(btn4);
      PnFlow.add(btn5);
     
      
  }
      
  }

    

