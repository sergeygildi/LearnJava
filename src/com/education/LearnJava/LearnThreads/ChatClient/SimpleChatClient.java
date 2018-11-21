package com.education.LearnJava.LearnThreads.ChatClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {

    private JTextArea incoming;
    private JTextField outgoing;
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;

    public static void main(String[] args) {
        new SimpleChatClient().go();
    }

    private void go(){

        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel panel = new JPanel();

        incoming = new JTextArea(15,20);

        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(incoming);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        outgoing = new JTextField(20);

        JButton button = new JButton("Send");
        button.addActionListener(new SendButtonListener());

        panel.add(scrollPane);
        panel.add(outgoing);
        panel.add(button);

        setUpNetworking();

        new Thread(new IncomingReader()).start();

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking(){

        try {
            socket = new Socket("127.0.0.1", 5000);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
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

    private class IncomingReader implements Runnable {


        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null){
                    System.out.println("Read " + message);
                    incoming.append(message + "\n");
                }
            } catch (IOException e) {
                System.out.println("Problem with reading line");
                e.printStackTrace();
            }
        }
    }
}