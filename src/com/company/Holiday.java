package com.company;

public class Holiday {
    String month;
    int day;
    String name;
    String description;
    boolean official;
    String phrase;


    public Holiday(String month, int day, String name, String description, boolean official, String phrase) {
        this.month = month;
        this.day = day;
        this.name = name;
        this.description = description;
        this.official = official;
        this.phrase = phrase;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }


    public void isToday(int day, String month) {
        if (day == day && month == month) {

        }

        public void celebrate(String phrase){

        }

    }
}