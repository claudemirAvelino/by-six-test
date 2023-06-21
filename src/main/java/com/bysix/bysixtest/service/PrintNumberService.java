package com.bysix.bysixtest.service;

public class PrintNumberService {
    public String correctedValue(Integer number) {
        if(number != null) {
            boolean isVisual = divisibleByThree(number);
            boolean isNuts = divisibleByFive(number);

            if (isVisual && isNuts) {

            } else if (isVisual) {

            } else if (isNuts) {

            } else {

            }

        }
    }

    private boolean divisibleByThree(int number) {
        return (number % 3) == 0;
    }

    private boolean divisibleByFive(int number) {
        return (number % 5) == 0;
    }
}
