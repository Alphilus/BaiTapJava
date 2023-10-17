package com.company;

import java.util.ArrayList;

public class TikTok {
    private String idols;
    private String songs;

    public TikTok(String idols, String songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public TikTok(ArrayList<Idols> idol, ArrayList<Song> song) {

    }

    public TikTok() {

    }

    public String getIdols() {
        return idols;
    }

    public void setIdols(String idols) {
        this.idols = idols;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "idols='" + idols + '\'' +
                ", songs='" + songs + '\'' +
                '}';
    }
}
