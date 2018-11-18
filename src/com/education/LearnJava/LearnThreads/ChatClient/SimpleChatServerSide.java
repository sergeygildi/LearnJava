package com.education.LearnJava.LearnThreads.ChatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SimpleChatServerSide {

    private ArrayList<PrintWriter> clientOutputStream;

    public static void main(String[] args) {
        new SimpleChatServerSide().go();
    }

    private void go() {
        clientOutputStream = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            while (true){
                Socket clientSocket = serverSocket.accept();

                clientOutputStream.add(new PrintWriter(clientSocket.getOutputStream()));
                new Thread(new ClientHandler(clientSocket)).start();

                System.out.println("got a connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private class ClientHandler implements Runnable {

        BufferedReader reader;
        Socket socket;

        public ClientHandler(Socket clientSocket) {

            try {
                socket = clientSocket;
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private void tellEveryone(String message) {

        for (PrintWriter aClientOutputStream : clientOutputStream) {
            try {
                aClientOutputStream.println(message);
                aClientOutputStream.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
