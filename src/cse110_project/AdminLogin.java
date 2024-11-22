package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends JFrame implements ActionListener {

    JLabel label1, usrLabel, pasLabel;
    JTextField usrtf;
    JPasswordField pasf;
    JButton btn1, btn2;

    AdminLogin() {

        setTitle("ADMIN LOGIN");
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon logo = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\logo.png");
        Image icon = logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo1 = new ImageIcon(icon);
        JLabel logoLabel = new JLabel(logo1);
        logoLabel.setBounds(80, 20, 100, 100);
        add(logoLabel);

        label1 = new JLabel();
        label1.setText("WELCOME TO BANK");
        Font fh = new Font("SERIF", Font.BOLD, 38);
        label1.setFont(fh);
        label1.setBounds(220, 50, 450, 40);
        add(label1);

        usrLabel = new JLabel("Username:");
        usrLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        usrLabel.setBounds(125, 150, 375, 30);
        add(usrLabel);

        usrtf = new JTextField(15);
        usrtf.setBounds(300, 150, 230, 30);
        usrtf.setFont(new Font("Arial", Font.BOLD, 14));
        add(usrtf);

        pasLabel = new JLabel("Password:");
        pasLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        pasLabel.setBounds(125, 220, 375, 30);
        add(pasLabel);

        pasf = new JPasswordField(15);
        pasf.setFont(new Font("Arial", Font.BOLD, 14));
        pasf.setBounds(300, 220, 230, 30);
        add(pasf);

        btn1 = new JButton("SIGN IN");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);

        btn2 = new JButton("CLEAR");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        btn1.setFont(new Font("Arial", Font.BOLD, 14));
        btn1.setBounds(300, 300, 100, 30);
        add(btn1);

        btn2.setFont(new Font("Arial", Font.BOLD, 14));
        btn2.setBounds(430, 300, 100, 30);
        add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == btn1) {

                String user, password;
                user = usrtf.getText();
                password = pasf.getText();
                File fi = new File("F:\\CSE\\CSE110_Project\\Files\\admin.txt");
                Scanner input = new Scanner(fi);
                String US = input.next();
                String PASS = input.next();
                if (user.equals(US) && password.equals(PASS)) {
                    JOptionPane.showMessageDialog(null, "Welcome");
                    setVisible(false);
                    new AdminInterface().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Username or Password\nTry Again");
                }
                input.close();
            } else if (ae.getSource() == btn2) {
                usrtf.setText("");
                pasf.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
