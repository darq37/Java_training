package com.dzmudziak;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clock {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;
    private LocalTime now = LocalTime.now();
    public Clock() {
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
        setTime();
    }

    public void advance() {
        this.seconds.advance();
        if (this.seconds.getValue() == 0) {
            this.minutes.advance();

            if (this.minutes.getValue() == 0) {
                this.hours.advance();
            }
        }
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    private void setTime(){
        this.hours.setValue(now.getHour());
        this.seconds.setValue(now.getSecond());
        this.minutes.setValue(now.getMinute());
    }
    public void start() {
        while (true) {
            System.out.println("Current time: " + this);
            this.advance();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }

        }
    }
}
