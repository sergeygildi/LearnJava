package com.education.LearnJava.LearnCollections.TryToReadSongTitleUdnerFileTxt;

import java.util.Objects;

public class Song implements Comparable<Song>{

    private String title;
    private String trackName;

    public Song(String title, String artist) {
            this.title = title;
            this.trackName = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getTrackName() {
        return trackName;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) &&
                Objects.equals(trackName, song.trackName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, trackName);
    }
}
