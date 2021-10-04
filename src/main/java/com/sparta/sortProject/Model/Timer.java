package com.sparta.sortProject.Model;

public class Timer {
    long startTime;
    long stopTime;
    long time;

    public void startTimer() {
        startTime=System.nanoTime();
    }
    public void stopTimer(){
        stopTime=System.nanoTime();
    }

    public long getTime() {
        time=stopTime-startTime;
        return time;
    }

}
