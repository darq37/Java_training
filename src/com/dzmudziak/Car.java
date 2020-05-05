package com.dzmudziak;

// W istniejącej klasie Car utwórz statyczną metodę przyjmującą tablicę obiektów klasy Car
// i zwracającą największy obiekt tej tablicy.
// Obiekt Car jest większy od drugiego obiektu jeśli jego maxSpeed jest większa.
// Jeśli maxSpeed są równe większy jest ten obiekt,
// którego accelleration jest większe.


import java.util.Arrays;
import java.util.Collections;

public class Car implements Comparable<Car> {

    int maxSpeed;
    int accelleration;


    public Car(int maxSpeed, int accelleration) {
        this.maxSpeed = maxSpeed;
        this.accelleration = accelleration;
    }

    public static Car getMax(Car[] cars) {
       return Collections.max(Arrays.asList(cars));
    }

    @Override
    public String toString() {
        return "Car with maxSpeed=" + maxSpeed + " and accelleration=" + accelleration;
    }

    @Override
    public int compareTo(Car o) {
        if (o.maxSpeed > this.maxSpeed) {
            return 1;
        } else if (o.maxSpeed < this.maxSpeed) {
            return -1;
        } else {
            if (o.accelleration > this.accelleration) {
                return 1;
            } else if (o.accelleration < this.accelleration) {
                return -1;
            } else return 0;
        }
    }
}
