package com.education.LearnJava.LearnThreads.DailyAdvice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class DailyAdviceServer {

    private String[] adviceList = {"Eat me", "Fuck me", "Soled me", "Rest me", "Love me", "Kick me,", "Kiss my ass"};

    private void go() {

        try {

            while (true){

                PrintWriter writer = new PrintWriter(new ServerSocket(5000)
                        .accept()
                        .getOutputStream());

                String advice = getAdvice();

                writer.println(advice);
                writer.close();

                System.out.println(advice);
            }
        } catch (IOException e) {
            System.out.println("Ошибка на стороне сервера");
            e.printStackTrace();
        }

    }

    private String getAdvice() {
        return adviceList[(int) (Math.random() * adviceList.length)];
    }

    public static void main(String[] args) {
        new DailyAdviceServer().go();
    }
}
