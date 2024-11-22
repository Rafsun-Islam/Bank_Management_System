package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField t1;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\transaction.jpg");
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 760);
        add(l3);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("100");
        b2 = new JButton("500");
        b3 = new JButton("1000");
        b4 = new JButton("2000");
        b5 = new JButton("5000");
        b6 = new JButton("10000");
        b7 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(330, 250, 700, 35);
        l3.add(l1);

        b1.setBounds(260, 320, 150, 35);
        l3.add(b1);

        b2.setBounds(540, 320, 150, 35);
        l3.add(b2);

        b3.setBounds(260, 380, 150, 35);
        l3.add(b3);

        b4.setBounds(540, 380, 150, 35);
        l3.add(b4);

        b5.setBounds(260, 440, 150, 35);
        l3.add(b5);

        b6.setBounds(540, 440, 150, 35);
        l3.add(b6);

        b7.setBounds(400, 500, 150, 35);
        l3.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(960, 660);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String balance = "";
            int amount1;
            String tamount = "";
            if (ae.getSource() == b1) {
                String amount = b1.getText();
                File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                Scanner input = new Scanner(f);

                while (input.hasNext()) {
                    String user = input.next();
                    String pin1 = input.next();
                    balance = input.next();
                    if (pin.equals(pin1)) {
                        
                            amount1 = Integer.parseInt(balance) - Integer.parseInt(amount);
                            tamount = String.valueOf(amount1);
                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + pin1 + " " + tamount + "\n");
                            wr1.close();
                        
                    } else {
                        BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                        wr1.write(user + " " + pin1 + " " + balance + "\n");
                        wr1.close();
                    }
                }
                input.close();
                f.delete();
                tmf.renameTo(f);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            } else if (ae.getSource() == b2) {
                String amount = b2.getText();
                File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                Scanner input = new Scanner(f);

                while (input.hasNext()) {
                    String user = input.next();
                    String pin1 = input.next();
                    balance = input.next();
                    if (pin.equals(pin1)) {
                        
                            amount1 = Integer.parseInt(balance) - Integer.parseInt(amount);
                            tamount = String.valueOf(amount1);
                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + pin1 + " " + tamount + "\n");
                            wr1.close();
                        
                    } else {
                        BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                        wr1.write(user + " " + pin1 + " " + balance + "\n");
                        wr1.close();
                    }
                }
                input.close();
                f.delete();
                tmf.renameTo(f);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            } else if (ae.getSource() == b3) {
                String amount = b3.getText();
                File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                Scanner input = new Scanner(f);

                while (input.hasNext()) {
                    String user = input.next();
                    String pin1 = input.next();
                    balance = input.next();
                    if (pin.equals(pin1)) {
                        
                            amount1 = Integer.parseInt(balance) - Integer.parseInt(amount);
                            tamount = String.valueOf(amount1);
                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + pin1 + " " + tamount + "\n");
                            wr1.close();
                        
                    } else {
                        BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                        wr1.write(user + " " + pin1 + " " + balance + "\n");
                        wr1.close();
                    }
                }
                input.close();
                f.delete();
                tmf.renameTo(f);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            } else if (ae.getSource() == b4) {
                String amount = b4.getText();
                File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                Scanner input = new Scanner(f);

                while (input.hasNext()) {
                    String user = input.next();
                    String pin1 = input.next();
                    balance = input.next();
                    if (pin.equals(pin1)) {
                        
                            amount1 = Integer.parseInt(balance) - Integer.parseInt(amount);
                            tamount = String.valueOf(amount1);
                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + pin1 + " " + tamount + "\n");
                            wr1.close();
                        
                    } else {
                        BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                        wr1.write(user + " " + pin1 + " " + balance + "\n");
                        wr1.close();
                    }
                }
                input.close();
                f.delete();
                tmf.renameTo(f);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            } else if (ae.getSource() == b5) {
                String amount = b5.getText();
                File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                Scanner input = new Scanner(f);

                while (input.hasNext()) {
                    String user = input.next();
                    String pin1 = input.next();
                    balance = input.next();
                    if (pin.equals(pin1)) {
                        
                            amount1 = Integer.parseInt(balance) - Integer.parseInt(amount);
                            tamount = String.valueOf(amount1);
                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + pin1 + " " + tamount + "\n");
                            wr1.close();
                        
                    } else {
                        BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                        wr1.write(user + " " + pin1 + " " + balance + "\n");
                        wr1.close();
                    }
                }
                input.close();
                f.delete();
                tmf.renameTo(f);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            } else if (ae.getSource() == b6) {
                String amount = b6.getText();
                File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                Scanner input = new Scanner(f);

                while (input.hasNext()) {
                    String user = input.next();
                    String pin1 = input.next();
                    balance = input.next();
                    if (pin.equals(pin1)) {
                        
                            amount1 = Integer.parseInt(balance) - Integer.parseInt(amount);
                            tamount = String.valueOf(amount1);
                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + pin1 + " " + tamount + "\n");
                            wr1.close();
                        
                    } else {
                        BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                        wr1.write(user + " " + pin1 + " " + balance + "\n");
                        wr1.close();
                    }
                }
                input.close();
                f.delete();
                tmf.renameTo(f);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            } else if (ae.getSource() == b7) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
