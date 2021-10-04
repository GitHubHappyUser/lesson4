package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class EightsHomework extends JFrame {
    private int counter = 0;

    public EightsHomework(int initialValue) {
        setBounds(400, 100,500, 500);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Courier New", Font.BOLD, 24);

        JTextField counterValue = new JTextField();
        counterValue.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue,BorderLayout.CENTER);
        counter = initialValue;
        counterValue.setText(String.valueOf(counter));

        JButton increment = new JButton(">");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        JButton decrement = new JButton("<");
        decrement.setFont(font);
        add(decrement, BorderLayout.WEST);

        JButton button = new JButton("Push the Button");
        button.setFont(font);
        add(button, BorderLayout.NORTH);

        JButton exit = new JButton("Exit");
        exit.setFont(font);
        add(exit, BorderLayout.SOUTH);

        counterValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = Integer.parseInt(counterValue.getText());
                counterValue.setText(String.valueOf(counter));
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterValue.setText(String.valueOf(counter));
            }
        });

        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                counterValue.setText(String.valueOf(counter));
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Button pushed successful %)");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window was closed");
            }
        });

        setVisible(true);

    }

    public static void main(String[] args) {
       new EightsHomework(0);
    }

}





