package de.codecentric.java8examples.lambdas;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 15:57
 * To change this template use File | Settings | File Templates.
 */
public class EventLambdas extends JFrame {

    private int clicks = 0;

    public EventLambdas() {
        JButton btn = new JButton("0");
        btn.setSize(50, 50);
        add(btn);

        // lambda magic goes here:
        btn.addActionListener(e -> {
            btn.setText(Integer.toString(clicks++));
        });

        setSize(100, 100);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EventLambdas();
    }
}
