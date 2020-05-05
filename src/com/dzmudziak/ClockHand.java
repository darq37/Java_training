package com.dzmudziak;

public class ClockHand {
    private Integer value;
    private Integer limit;


    public ClockHand(Integer limit) {
        this.value = 0;
        this.limit = limit;
    }

    public void advance() {
        this.value++;
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
