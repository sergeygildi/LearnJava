package com.education.LearnJava.LearnTreads.ChatClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {

    private JTextField outgoing;
    private PrintWriter writer;

    private void go(){

        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel panel = new JPanel();

        outgoing = new JTextField(20);
        JButton button = new JButton("Send");

        button.addActionListener(new SendButtonListener());

        panel.add(outgoing);
        panel.add(button);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        setUpNetworking();

        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking(){

        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            System.out.println("Fail connect to server");
            e.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex){
                System.out.println("Catch exception" + ex);
                ex.printStackTrace();
            }

            outgoing.setText("");
            outgoing.requestFocus();

        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }

}
