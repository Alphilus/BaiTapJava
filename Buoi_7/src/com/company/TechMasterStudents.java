package com.company;

public abstract class TechMasterStudents {
    private final String name;
    private final String major;

    public TechMasterStudents(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getScore();

    public String classification(){
        if (getScore()<5)
            return "Yếu";
        else if (getScore()>=5 && getScore()<6.5)
            return "TB";
        else if (getScore()>=6.5 && getScore()<8)
            return "Khá";
        else return "Giỏi";
    }

    public void printInfo(){
        System.out.println("Học sinh:" +name+"- chuyên ngành: "+major+" - score:"+getScore()+" - Học lực : "+classification());
    }
}
