package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private final JPanel panel;
    private JLabel label;

    public GUI() {
        JFrame frame = new JFrame();
        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30 ,10, 30));
        panel.setLayout(new GridLayout());

        addComponents(frame, panel);
        configFrame(frame);
    }

    private void addComponents(JFrame frame, JPanel panel) {
        label = new JLabel("Number of clicks: 0");
        JButton button = new JButton("Click me!");
        button.addActionListener(this);
        panel.add(button);
        panel.add(label);
    }

    private void configFrame(JFrame frame) {
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
