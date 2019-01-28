package com.education.Java.Collections.TryToReadSongTitleUdnerFileTxt;

import java.io.*;
import java.util.*;

public class JokeBox {

    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new JokeBox().go();
    }

    /**
     * Мы создаем вложенный класс, который реализует интерфейс Comparator<E>
     * для того чтобы выполнить сортировку нескольких параметров одного объекта.\
     * В данном случае сортировака проиводится по названию.
     */
    class ArtistCompare implements Comparator<Song> {
        @Override
        public int compare(Song one, Song two) {
            return one.getTitle().compareTo(two.getTitle());
        }
    }


    private void go() {
        getSong();
        System.out.println(" Not sorted: \n" + songList);
        Collections.sort(songList);
        System.out.println();

        System.out.println(" Sorted by Comparable: \n" + songList);
        System.out.println();
        /**
         * Здесь мы выполняем непосредственно сортировку вызывая метод sort() класса Collections.
         * Передаем в перегруженный метод sort() объект (в данном случае у нас это лист)
         * и созданный экземпляр Comparator'а
         */
        Collections.sort(songList, new ArtistCompare());
        System.out.println(" Sorted by Comparator: \n"  + songList);

        /**
         * Для случаев когда множетво не должно содержать дубликатов
         */
        HashSet<Song> songHashSet = new HashSet<>();
        songHashSet.addAll(songList);
        System.out.println();
        System.out.println(" Created HashSet (Don't have duplicate): \n" + songHashSet);

        /**
         * Для случаев когда множество (помимо того что не должно содержать дубликатов), еще должно оставаться
         * отсортированным
         */
        TreeSet<Song> songTreeSet = new TreeSet<>(songList);
//        songTreeSet.addAll(songList);
        System.out.println();
        System.out.println(" Created TreeSet(Don't have duplicate and sorted by alphabet): \n" + songTreeSet);
    }


    void getSong() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }

        } catch (Exception e) {
            System.out.println("Файл не найден, или не удалось прочитать");
            e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1]);
        songList.add(nextSong);
    }
}
