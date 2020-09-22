package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{

    JPanel panel = new JPanel();
    JButton button1 = new JButton("First fighter");
    JButton button2 = new JButton("Second fighter");
    int i = 0;
    int t = 0;
    JLabel label1 = new JLabel("Result: " + i +" "+ "X" +" "+ t);
    JLabel label2 = new JLabel("Last Scorer: ");
    JLabel label3 = new JLabel("Winner: ");

    public GUI(int a, int b) {
        super("Простое графическое окно");
        setSize(a, b);
        setVisible(true);

        add(panel);
        panel.setLayout(new GridLayout(3,3));
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i+=1;
                label1.setText("Result: " + i +" "+ "X" +" "+ t);
                label2.setText("Last Scorer: First fighter");
                if(i < t) label3.setText("Winner: Second fighter");
                else if(i > t) label3.setText("Winner: First fighter");
                else label3.setText("Winner: ");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t+=1;
                label1.setText("Result: " + i +" "+ "X" +" "+ t);
                label2.setText("Last Scorer: Second fighter");
                if(i < t) label3.setText("Winner: Second fighter");
                else if(i > t) label3.setText("Winner: First fighter");
                else label3.setText("Winner: ");
            }
        });

    }
}