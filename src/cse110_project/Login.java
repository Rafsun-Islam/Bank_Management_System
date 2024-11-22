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

public class Login extends JFrame implements ActionListener {

    JLabel label;

    JButton btn1, btn2;

    Login() {

        setTitle("Bank Management");

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon("F:\\CSE\\CSE110_Project\\icons\\logo.png");
        Image icon = logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo1 = new ImageIcon(icon);
        JLabel imageLabel = new JLabel(logo1);
        imageLabel.setBounds(80, 20, 100, 100);
        add(imageLabel);

        label = new JLabel();
        label.setText("WELCOME TO BANK");
        Font fh = new Font("SERIF", Font.BOLD, 38);
        label.setFont(fh);
        label.setBounds(220, 50, 400, 40);
        label.setForeground(Color.BLACK);
        add(label);

        btn1 = new JButton();
        btn1.setText("ADMIN");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);

        Font fh1 = new Font("Arial", Font.BOLD, 18);
        btn1.setFont(fh1);
        btn1.setBounds(170, 200, 150, 40);
        add(btn1);

        btn2 = new JButton();
        btn2.setText("USER");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        btn2.setFont(fh1);
        btn2.setBounds(460, 200, 150, 40);
        add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == btn1) {
                setVisible(false);
                new AdminLogin();
            } else if (ae.getSource() == btn2) {
                setVisible(false);
                new UserLogin();

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
