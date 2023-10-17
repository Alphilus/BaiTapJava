package com.company;

import java.util.ArrayList;

public class Idols extends Follower{
    private String name;
    private int id;
    private String email;
    private int followers;
    private String group;

    public Idols(String nameF, int idF, String emailF, int numberOfLike, String name, int id, String email, int followers, String group) {
        super(nameF, idF, emailF, numberOfLike);
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public Idols(String name, int id, String email, int followers, String group, ArrayList<Follower> follower) {
        super(name, id, email, followers, group, follower);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idols{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
