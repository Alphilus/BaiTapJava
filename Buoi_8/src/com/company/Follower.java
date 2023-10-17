package com.company;

import java.util.ArrayList;

public class Follower {
    private String nameF;
    private int idF;
    private String emailF;
    private int numberOfLike;

    public Follower(String nameF, int idF, String emailF, int numberOfLike) {
        this.nameF = nameF;
        this.idF = idF;
        this.emailF = emailF;
        this.numberOfLike = numberOfLike;
    }

    public Follower(String name, int id, String email, int followers, String group, ArrayList<Follower> follower) {

    }

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public int getIdF() {
        return idF;
    }

    public void setIdF(int idF) {
        this.idF = idF;
    }

    public String getEmailF() {
        return emailF;
    }

    public void setEmailF(String emailF) {
        this.emailF = emailF;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "nameF='" + nameF + '\'' +
                ", idF=" + idF +
                ", emailF='" + emailF + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
