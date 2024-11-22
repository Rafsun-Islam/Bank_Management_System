package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener {

    JLabel l1, l2, ln, ldb, lg, le, lms, lad, lnd;
    JTextField tn, tdb, te, tad, tct;
    JRadioButton r1, r2, r3, r4, r5;
    JButton b;

    String userID;
    int at;

    Signup(String userID, int at) {

        this.userID = userID;
        this.at = at;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\logo.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(100, 40, 100, 100);
        add(l11);

        l1 = new JLabel("APPLICATION FORM NO. " + userID);
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setBounds(225, 60, 600, 40);
        add(l1);

        l2 = new JLabel("Page 2: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(290, 120, 600, 30);
        add(l2);

        ln = new JLabel("Name:");
        ln.setFont(new Font("Raleway", Font.BOLD, 20));
        ln.setBounds(100, 190, 100, 30);
        add(ln);

        ldb = new JLabel("Date of Birth:");
        ldb.setFont(new Font("Raleway", Font.BOLD, 20));
        ldb.setBounds(100, 240, 200, 30);
        add(ldb);

        lg = new JLabel("Gender:");
        lg.setFont(new Font("Raleway", Font.BOLD, 20));
        lg.setBounds(100, 290, 200, 30);
        add(lg);

        le = new JLabel("Email Address:");
        le.setFont(new Font("Raleway", Font.BOLD, 20));
        le.setBounds(100, 340, 200, 30);
        add(le);

        lms = new JLabel("Marital Status:");
        lms.setFont(new Font("Raleway", Font.BOLD, 20));
        lms.setBounds(100, 390, 200, 30);
        add(lms);

        lad = new JLabel("Address:");
        lad.setFont(new Font("Raleway", Font.BOLD, 20));
        lad.setBounds(100, 440, 200, 30);
        add(lad);

        lnd = new JLabel("NID:");
        lnd.setFont(new Font("Raleway", Font.BOLD, 20));
        lnd.setBounds(100, 490, 200, 30);
        add(lnd);

        tn = new JTextField();
        tn.setFont(new Font("Raleway", Font.BOLD, 14));
        tn.setBounds(300, 190, 400, 30);
        add(tn);

        tdb = new JTextField();
        tdb.setFont(new Font("Raleway", Font.BOLD, 14));
        tdb.setBounds(300, 240, 400, 30);
        add(tdb);

        te = new JTextField();
        te.setFont(new Font("Raleway", Font.BOLD, 14));
        te.setBounds(300, 340, 400, 30);
        add(te);

        tad = new JTextField();
        tad.setFont(new Font("Raleway", Font.BOLD, 14));
        tad.setBounds(300, 440, 400, 30);
        add(tad);

        tct = new JTextField();
        tct.setFont(new Font("Raleway", Font.BOLD, 14));
        tct.setBounds(300, 490, 400, 30);
        add(tct);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(620, 560, 80, 30);
        add(b);

        r1 = new JRadioButton("Male");

        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(300, 390, 100, 30);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(450, 390, 100, 30);
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        r5.setBounds(635, 390, 100, 30);
        add(r5);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String name = tn.getText();
        String dob = tdb.getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = te.getText();
        String marital = null;
        if (r3.isSelected()) {
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        } else if (r5.isSelected()) {
            marital = "Other";
        }

        String address = tad.getText();
        String city = tct.getText();

        try {

            if (at == 1) {
                BufferedWriter wr = new BufferedWriter(new FileWriter("F:\\CSE\\CSE110_Project\\Files\\savingacc.txt", true));
                wr.write(userID + " " + name + " " + dob + " " + gender + " " + email + " " + marital + " " + address + " " + city + "\n");
                wr.close();
                new SignupTwo(userID).setVisible(true);
                setVisible(false);
            } else if (at == 2) {
                BufferedWriter wr = new BufferedWriter(new FileWriter("F:\\CSE\\CSE110_Project\\Files\\depositacc.txt", true));
                wr.write(userID + " " + name + " " + dob + " " + gender + " " + email + " " + marital + " " + address + " " + city + "\n");
                wr.close();
                new SignupTwo(userID).setVisible(true);
                setVisible(false);
            } else {
                BufferedWriter wr = new BufferedWriter(new FileWriter("F:\\CSE\\CSE110_Project\\Files\\currentacc.txt", true));
                wr.write(userID + " " + name + " " + dob + " " + gender + " " + email + " " + marital + " " + address + " " + city + "\n");
                wr.close();
                new SignupTwo(userID).setVisible(true);
                setVisible(false);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
