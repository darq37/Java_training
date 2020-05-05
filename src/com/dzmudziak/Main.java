package com.dzmudziak;

public class Main {

    public static void main(String[] args) {
        //Clock clock = new Clock();
        //clock.start();

        // Napisz metodę wyznaczającą dany element ciągu,
        // którego kolejny wyraz jest sumą dwóch poprzednich.
        // Pierwsze dwa wyrazy tego ciągu są równe 1.
        // Jest to zatem ciąg { 1, 1, 2, 3, 5, 8, 13, 21, ... }
        System.out.println(calculate(7));


    }
    public static int calculate(int number){
        if (number == 1){
            return 1;
        }
        if (number== 2){
            return 1;
        }
        return calculate(number-1)+ calculate(number-2);
    }


}
