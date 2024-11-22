
package cse110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ShowAccounts extends JFrame implements ActionListener {

    JButton b1;

    ShowAccounts() {
        
        setTitle("DETAILS");
        
        b1 = new JButton("LOG OUT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(500, 405, 100, 30);
        add(b1);
        
        b1.addActionListener(this);
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
        try {

            File f = new File("F:\\CSE\\CSE110_Project\\Files\\user.txt");
            Scanner input = new Scanner(new FileReader(f));
            int row = 0;
            int col = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                row++;
                col = line.split(" ").length;
            }
            input.close();
            String[][] d = new String[row][col];
            input = new Scanner(new FileReader(f));

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    d[i][j] = input.next();
                 }
                String column[] = {"USER ID ", "PIN", "BALANCE"};
                JTable T = new JTable(d, column);
                JScrollPane JP = new JScrollPane(T);
                JP.setBounds(0, 0, 780, 400);

                add(JP);
            }input.close();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
}
