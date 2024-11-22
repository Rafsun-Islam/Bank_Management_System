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
import javax.swing.JPasswordField;

public class Pin extends JFrame implements ActionListener {

    JPasswordField t1, t2;
    JButton b1, b2;
    JLabel l1, l2, l3;
    String pin;

    Pin(String pin) {
        this.pin = pin;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\transaction.jpg");
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 960, 760);
        add(l4);

        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);

        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);

        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);

        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));

        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 25));

        b1 = new JButton("CHANGE");
        b2 = new JButton("BACK");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        l1.setBounds(350, 250, 800, 35);
        l4.add(l1);

        l2.setBounds(200, 320, 150, 35);
        l4.add(l2);

        l3.setBounds(200, 360, 200, 35);
        l4.add(l3);

        t1.setBounds(350, 320, 180, 25);
        l4.add(t1);

        t2.setBounds(350, 360, 180, 25);
        l4.add(t2);

        b1.setBounds(360, 420, 150, 35);
        l4.add(b1);

        b2.setBounds(360, 480, 150, 35);
        l4.add(b2);

        setSize(960, 660);
        setLocationRelativeTo(null);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String npin = t1.getText();
            String rpin = t2.getText();

            if (ae.getSource() == b1) {
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");

                } else if (npin.equals("") || rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Entered PIN can not be empty");
                } else if (npin.equals(rpin)) {
                    File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
                    File tmf = new File("F:\\CSE\\CSE110_Project\\Files\\temp.txt");
                    Scanner input = new Scanner(f);

                    while (input.hasNext()) {
                        String user = input.next();
                        String pin1 = input.next();
                        String balance = input.next();
                        if (pin.equals(pin1)) {

                            BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmf, true));
                            wr1.write(user + " " + npin + " " + balance + "\n");
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
                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
                    setVisible(false);
                    new Transactions(rpin).setVisible(true);

                }
            } else if (ae.getSource() == b2) {
                new Transactions(pin).setVisible(true);
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
