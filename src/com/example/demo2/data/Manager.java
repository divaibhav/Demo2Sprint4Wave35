package com.example.demo2.data;

public class Manager extends Employee{
    private int teamSize;
    private int teamRating;

    public Manager(String name, int age, String dob, Address address, int teamSize, int teamRating) {
        super(name, age, dob, address);
        this.teamSize = teamSize;
        this.teamRating = teamRating;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(int teamRating) {
        this.teamRating = teamRating;
    }
}
