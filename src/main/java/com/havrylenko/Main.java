package com.havrylenko;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button example");
        JButton button = new JButton("Click here");
        button.setBounds(50, 100, 95, 30);
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
