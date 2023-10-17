package com.company;

public class Song extends TikTok{
    private int idS;
    private String nameS;
    private String singer;

    public Song(int idS, String nameS, String singer) {
        super();
        this.idS = idS;
        this.nameS = nameS;
        this.singer = singer;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "idS=" + idS +
                ", nameS='" + nameS + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
