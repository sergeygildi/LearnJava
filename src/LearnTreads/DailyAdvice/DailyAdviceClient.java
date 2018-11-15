package LearnTreads.DailyAdvice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    public void go(){

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new Socket("127.0.0.1", 4242).getInputStream()));
            System.out.println("Сегодны ты должен: " + reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка подключения к серверу");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DailyAdviceClient().go();
    }
}
