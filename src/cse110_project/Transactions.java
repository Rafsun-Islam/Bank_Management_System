
package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Transactions extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\transaction.jpg");
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 760);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
       
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("CASH WITHDRAWL");
        b3 = new JButton("FAST CASH");
        b4 = new JButton("PIN CHANGE");
        b5 = new JButton("BALANCE ENQUIRY");
        b6 = new JButton("EXIT");
        
        
        setLayout(null);
        
        l1.setBounds(350,230,240,50);
        l2.add(l1);
        
        b1.setBounds(260,320,150,35);
        l2.add(b1);
        
        b2.setBounds(540,320,150,35);
        l2.add(b2);
        
        b3.setBounds(260,380,150,35);
        l2.add(b3);
        
        b4.setBounds(540,380,150,35);
        l2.add(b4);
        
        b5.setBounds(260,440,150,35);
        l2.add(b5);
        
        b6.setBounds(540,440,150,35);
        l2.add(b6);
        
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        
        
        setSize(960,660);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==b2){ 
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }else if(ae.getSource()==b3){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource()==b4){ 
            setVisible(false);
            new Pin(pin).setVisible(true);
        }else if(ae.getSource()==b5){ 
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if(ae.getSource()==b6){ 
           System.exit(0);
        }
    }

}
