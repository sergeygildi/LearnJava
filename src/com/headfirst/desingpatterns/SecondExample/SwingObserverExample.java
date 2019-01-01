package com.headfirst.desingpatterns.SecondExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    public static void main(String[] args) {
        new SwingObserverExample().go();
    }

    public void go(){
        JFrame jFrame = new JFrame();
        JButton button = new JButton("Should i do it?");
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        button.addActionListener(new AngelListener());
        button.addActionListener(new DemonListener());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do this.");
        }
    }

    class DemonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on. Do this.");
        }
    }
}
