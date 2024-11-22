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


public class AdminInterface extends JFrame implements ActionListener {
    
    JLabel label1;
    
    JButton btn1, btn2;
    
    AdminInterface() {
        
        setTitle("ADMIN INTERFACE");
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon logo = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\logo.png");
        Image icon = logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo1 = new ImageIcon(icon);
        JLabel logoLabel = new JLabel(logo1);
        logoLabel.setBounds(80, 20, 100, 100);
        add(logoLabel);
        
        
        label1 = new JLabel("WELCOME ADMIN");
        label1.setFont(new Font("Osward", Font.BOLD, 38));
        label1.setBounds(220, 50, 450, 40);
        add(label1);
        
        btn1 = new JButton("Show Acoounts");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        
        btn2 = new JButton("EXIT");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        
        btn1.setFont(new Font("Arial", Font.BOLD, 18));
        btn1.setBounds(140, 200, 200, 30);
        add(btn1);
        
        btn2.setFont(new Font("Arial", Font.BOLD, 18));
        btn2.setBounds(500, 200, 100, 30);
        add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 480);
        setLocationRelativeTo(null);
        add(label1);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {            
            setVisible(false);
            new ShowAccounts().setVisible(true);
        } else if (ae.getSource() == btn2) {            
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
}
