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

public class Withdrawl extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b1, b2;
    JLabel l2, l3, l4;
    String pin, formno;

    Withdrawl(String pin) {

        this.pin = pin;
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\transaction.jpg");
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 760);
        add(l3);

        l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System", Font.BOLD, 16));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));

        b1 = new JButton("WITHDRAW");
        b2 = new JButton("BACK");

        l2.setBounds(310, 230, 400, 20);
        l3.add(l2);

        t1.setBounds(280, 300, 330, 30);
        l3.add(t1);

        b1.setBounds(390, 360, 150, 35);
        l3.add(b1);

        b2.setBounds(390, 420, 150, 35);
        l3.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(960, 660);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = t1.getText();
            String balance = "";
            int amount1;
            String tamount = "";
            if (ae.getSource() == b1) {
                if (amount.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                } else {

                    File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                    File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                    Scanner input = new Scanner(f);

                    while (input.hasNext()) {
                        String user = input.next();
                        String pin1 = input.next();
                        balance = input.next();
                        if (pin.equals(pin1)) {
                            if (Integer.parseInt(balance) < Integer.parseInt(amount)) {
                                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                                BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                                wr1.write(user + " " + pin1 + " " + balance + "\n");
                                wr1.close();
                                break;
                            } else {
                                amount1 = Integer.parseInt(balance) - Integer.parseInt(amount);
                                tamount = String.valueOf(amount1);
                                BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                                wr1.write(user + " " + pin1 + " " + tamount + "\n");
                                wr1.close();
                                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                            }
                        } else {
                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + pin1 + " " + balance + "\n");
                            wr1.close();
                        }
                    }
                    input.close();
                    f.delete();
                    tmf.renameTo(f);

                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            } else if (ae.getSource() == b2) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }

}
