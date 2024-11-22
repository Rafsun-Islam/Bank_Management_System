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
import javax.swing.JTextField;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b1, b2, b3;
    JLabel l1, l2, l3;
    String pin;

    BalanceEnquiry(String p) {
        this.pin = p;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\transaction.jpg");
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 760);
        add(l3);

        l1 = new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.WHITE);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(310, 300, 335, 35);
        l3.add(l1);

        b1.setBounds(390, 370, 150, 35);
        l3.add(b1);
        String user, pin1, balance="", balance1 = "";
        try {
            File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                user = input.next();
                pin1 = input.next();
                balance = input.next();
               if (pin.equals(pin1)) {
                    
                    balance1 = balance;
                    
                }
            }
            input.close();

        } catch (Exception e) {
        }

        l1.setText("Your Current Account Balance is Rs " + balance1);

        b1.addActionListener(this);

        setSize(960, 660);
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }

}
