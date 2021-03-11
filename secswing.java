/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingprac;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author PRATIK AWASTHI
 */
public class secswing 
{
    public static void main(String[] args) {
        Ad obj =new Ad();
    }
}
class Ad extends JFrame implements ActionListener
{
    JTextField jt1,jt2;
    JButton b;
       JLabel l;
     public Ad()
    {
        jt1=new JTextField(20);
    jt2=new JTextField(20);
     b=new JButton("ok");
        l=new JLabel("result");
        add(jt2);
        add(jt1);
        add(b);
        add(l);
        b.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public void actionPerformed(ActionEvent ae)
     {
         int num1=Integer.parseInt(jt1.getText());
         int num2=Integer.parseInt(jt2.getText());
         int value=num1+num2;
         l.setText(value+"");
     }
}