package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignupThree extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11,l12;
    JButton b1, b2;
    JTextField tfl;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    String userID;

    SignupThree(String userID) {
        this.userID = userID;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\logo.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 20, 100, 100);
        add(l14);

        l1 = new JLabel("Page 4: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Card Number:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));

        l3 = new JLabel("XXXXX");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));

        l4= new JLabel("(Your 5-digit User Number)");
        l4.setFont(new Font("Raleway", Font.BOLD, 12));

        l5 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));

        l6= new JLabel("PIN:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));

        l7 = new JLabel("XXXX");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));

        l8 = new JLabel("(4-digit password)");
        l8.setFont(new Font("Raleway", Font.BOLD, 12));

        l9 = new JLabel("Services Required:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));

        l10 = new JLabel("Form No:");
        l10.setFont(new Font("Raleway", Font.BOLD, 14));

        l11 = new JLabel(userID);
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel("Deposit:");
        l12.setFont(new Font("Raleway", Font.BOLD, 18));

        tfl = new JTextField();
        tfl.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));

        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));

        setLayout(null);

        

        l1.setBounds(280, 60, 400, 40);
        add(l1);

        l2.setBounds(100, 140, 200, 30);
        add(l2);

        l3.setBounds(330, 140, 250, 30);
        add(l3);

        l4.setBounds(100, 180, 200, 20);
        add(l4);

        l5.setBounds(330, 180, 500, 20);
        add(l5);

        l6.setBounds(100, 220, 200, 30);
        add(l6);

        l7.setBounds(330, 220, 200, 30);
        add(l7);

        l8.setBounds(100, 260, 200, 20);
        add(l8);

        l9.setBounds(100, 300, 200, 30);
        add(l9);
        
        l10.setBounds(700, 10, 70, 30);
        add(l10);

        l11.setBounds(770, 10, 40, 30);
        add(l11);
        
        l12.setBounds(100, 500, 100, 30);
        add(l12);

        c1.setBounds(100, 340, 200, 30);
        add(c1);

        c2.setBounds(350, 340, 200, 30);
        add(c2);

        c3.setBounds(100, 380, 200, 30);
        add(c3);

        c4.setBounds(350, 380, 200, 30);
        add(c4);

        c5.setBounds(100, 420, 200, 30);
        add(c5);

        c6.setBounds(350, 420, 200, 30);
        add(c6);

        c7.setBounds(100, 460, 600, 20);
        add(c7);

        b1.setBounds(250, 600, 100, 30);
        add(b1);

        b2.setBounds(420, 600, 100, 30);
        add(b2);
        
        tfl.setBounds(250, 500, 400, 30);
        add(tfl);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        Random ran = new Random();
        int first4 = ran.nextInt(10000);
        String pin =String.valueOf(first4);

        String facility = "";
        String deposit = tfl.getText();
        if (c1.isSelected()) {
            facility = facility + "ATM Card";
        }
        if (c2.isSelected()) {
            facility = facility + "Internet Banking";
        }
        if (c3.isSelected()) {
            facility = facility + "Mobile Banking";
        }
        if (c4.isSelected()) {
            facility = facility + "EMAIL Alerts";
        }
        if (c5.isSelected()) {
            facility = facility + "Cheque Book";
        }
        if (c6.isSelected()) {
            facility = facility + "E-Statement";
        }

        try {
            if (ae.getSource() == b1) {

                if (deposit.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    BufferedWriter wr = new BufferedWriter(new FileWriter("F:\\CSE\\CSE110_Project\\Files\\additionaldata.txt", true));
                    BufferedWriter wr1 = new BufferedWriter(new FileWriter("F:\\CSE\\CSE110_Project\\Files\\user.txt", true));
                    wr.write(" " + facility+"\n");
                    wr1.write(userID + " " + pin+" "+deposit+"\n");
                    wr.close();
                    wr1.close();
                    JOptionPane.showMessageDialog(null, "Card Number: " + userID + "\n Pin:" + pin);

                    new Transactions(pin);
                    setVisible(false);
                }

            } else if (ae.getSource() == b2) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
