package com.example.myapplication;

public class weather {

    private int srcimage ,backgroundimg;
    private String Countryname,Tempreature,Clock;

    public weather(int srcimage, String countryname, String tempreature, String clock,int backgroundimg) {
        this.srcimage = srcimage;
        Countryname = countryname;
        Tempreature = tempreature;
        Clock = clock;
        this.backgroundimg=backgroundimg;
    }

    public int getBackgroundimg() {
        return backgroundimg;
    }

    public void setBackgroundimg(int backgroundimg) {
        this.backgroundimg = backgroundimg;
    }

    public int getSrcimage() {
        return srcimage;
    }

    public void setSrcimage(int srcimage) {
        this.srcimage = srcimage;
    }

    public String getCountryname() {
        return Countryname;
    }

    public void setCountryname(String countryname) {
        Countryname = countryname;
    }

    public String getTempreature() {
        return Tempreature;
    }

    public void setTempreature(String tempreature) {
        Tempreature = tempreature;
    }

    public String getClock() {
        return Clock;
    }

    public void setClock(String clock) {
        Clock = clock;
    }
}
