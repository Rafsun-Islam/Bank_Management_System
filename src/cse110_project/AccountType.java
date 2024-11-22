package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class AccountType extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JRadioButton r1, r2, r3;
    JButton b;

    Random rand = new Random();
    int rn = rand.nextInt(100000);
    String userID = String.valueOf(rn);

    AccountType() {

        setTitle("NEW ACCOUNT APPLICATION FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\logo.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);

        l1 = new JLabel("APPLICATION FORM NO. " + userID);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setForeground(Color.BLACK);
        l1.setBounds(140, 20, 600, 40);
        add(l1);

        Font f = new Font("Raleway", Font.BOLD, 22);
        l2 = new JLabel("Page 1: Account Type");
        l2.setFont(f);
        l2.setBounds(290, 80, 600, 30);
        add(l2);

        Font f1 = new Font("Raleway", Font.BOLD, 18);
        l3 = new JLabel("Category:");
        l3.setFont(f1);

        l3.setBounds(100, 145, 100, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        Font f2 = new Font("Raleway", Font.BOLD, 16);
        r1.setFont(f2);
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 200, 150, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(f2);
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 200, 300, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(f2);
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 240, 250, 30);
        add(r3);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);

        setLayout(null);

        b = new JButton("NEXT");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(300, 350, 230, 30);
        add(b);

        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        int at = 0;

        if (r1.isSelected()) {

            at = 1;
        } else if (r2.isSelected()) {

            at = 2;
        } else if (r3.isSelected()) {

            at = 3;
        } else {
            at = 0;
        }
        try {
            if (ae.getSource() == b) {
                if (at == 0) {
                    JOptionPane.showMessageDialog(null, "Choose One Option.");
                } else {
                    new Signup(userID, at);
                    setVisible(false);
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
