package com.bysix.bysixtest.service;

public class PrintNumberService {
    private static final int NUMBER = 100;

    public void print(){
        for(int i = 1; i <= NUMBER; i++){
            System.out.println(correctedValue(i));
        }
    }

    public String correctedValue(int number) {

        boolean isVisual = divisibleByThree(number);
        boolean isNuts = divisibleByFive(number);
        if (isVisual && isNuts) {
            // teste
        } else if (isVisual) {
            // visual return
        } else if (isNuts) {
            // nuts return
        } else {
            // raw number return
        }
    }

    private boolean divisibleByThree(int number) {
        return (number % 3) == 0;
    }

    private boolean divisibleByFive(int number) {
        return (number % 5) == 0;
    }
}
