package com.bysix.bysixtest.service;

import com.bysix.bysixtest.Enum.VNEnum;

import java.util.HashMap;
import java.util.Map;

import static com.bysix.bysixtest.util.UtilMath.divisibleByFive;
import static com.bysix.bysixtest.util.UtilMath.divisibleByThree;

public class PrintNumberService {
    private static final int NUMBER = 100;
    private Map<VNEnum, String> messages;

    public void print(){
        for(int i = 1; i <= NUMBER; i++){
            System.out.println(correctedValue(i));
        }
    }

    public PrintNumberService(){
        setMessages();
    }

    private void setMessages() {
        messages = new HashMap<>();
        messages.put(VNEnum.VISUAL, "Visual");
        messages.put(VNEnum.NUTS, "Nuts");
        messages.put(VNEnum.VISUAL_NUTS, "Visual Nuts");
    }

    public String correctedValue(int number) {
        boolean isVisual = divisibleByThree(number);
        boolean isNuts = divisibleByFive(number);

        if (isVisual && isNuts) {
            return messages.get(VNEnum.VISUAL_NUTS);
        } else if (isVisual) {
            return messages.get(VNEnum.VISUAL);
        } else if (isNuts) {
            return messages.get(VNEnum.NUTS);
        } else {
            return Integer.toString(number);
        }
    }
}
