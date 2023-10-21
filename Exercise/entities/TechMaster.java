package com.company.entities;

public class TechMaster {
    private String manager;
    private String teacher;
    private ClassRoom classRoom;

    public TechMaster(String manager, String teacher) {
        this.manager = manager;
        this.teacher = teacher;
    }

    public void setClassRoom(ClassRoom classRoom){
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "manager='" + manager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classRoom=" + classRoom +
                '}';
    }
}
