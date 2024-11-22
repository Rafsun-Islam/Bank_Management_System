package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class SignupTwo extends JFrame implements ActionListener {

    JLabel l1, lr, lin, ledu, loc,  lql, lfn, lfn1;
    JButton b;
    JComboBox c1, c2, c3, c4;
    String userID;

    SignupTwo(String userID) {

        this.userID = userID;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\logo.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 40, 100, 100);
        add(l14);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Page 3: Additonal Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 90, 600, 40);
        add(l1);

        lr = new JLabel("Religion:");
        lr.setFont(new Font("Raleway", Font.BOLD, 18));
        lr.setBounds(100, 170, 100, 30);
        add(lr);


        lin = new JLabel("Income:");
        lin.setFont(new Font("Raleway", Font.BOLD, 18));
        lin.setBounds(100, 220, 100, 30);
        add(lin);

        ledu = new JLabel("Educational");
        ledu.setFont(new Font("Raleway", Font.BOLD, 18));
         ledu.setBounds(100, 270, 150, 30);
        add(ledu);

        lql = new JLabel("Qualification:");
        lql.setFont(new Font("Raleway", Font.BOLD, 18));
        lql.setBounds(100, 290, 150, 30);
        add(lql);

        loc = new JLabel("Occupation:");
        loc.setFont(new Font("Raleway", Font.BOLD, 18));
        loc.setBounds(100, 340, 150, 30);
        add(loc);

        lfn = new JLabel("Form No:");
        lfn.setFont(new Font("Raleway", Font.BOLD, 13));
        lfn.setBounds(700, 10, 60, 30);
        add(lfn);

        lfn1 = new JLabel(userID);
        lfn1.setFont(new Font("Raleway", Font.BOLD, 13));
        lfn1.setBounds(760, 10, 60, 30);
        add(lfn1);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(570, 440, 100, 30);
        add(b);

        String religion[] = {"Muslim", "Hindu", "Buddhist", "Christian", "Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(350, 170, 320, 30);
        add(c1);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        c2 = new JComboBox(income);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(350, 220, 320, 30);
        add(c2);

        String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        c3 = new JComboBox(education);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(350, 270, 320, 30);
        add(c3);

        String occupation[] = {"Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others"};
        c4 = new JComboBox(occupation);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(350, 340, 320, 30);
        add(c4);

        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 580);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) c1.getSelectedItem();
        String income = (String) c2.getSelectedItem();
        String education = (String) c3.getSelectedItem();
        String occupation = (String) c4.getSelectedItem();

        try {
            if (religion.equals("") || income.equals("") || education.equals("") || occupation.equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            } else {
                BufferedWriter wr = new BufferedWriter(new FileWriter("F:\\CSE\\CSE110_Project\\Files\\additionaldata.txt", true));
                wr.write(userID + " " + religion + " " + income + " " + education + " " + occupation);
                wr.close();

                new SignupThree(userID).setVisible(true);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
