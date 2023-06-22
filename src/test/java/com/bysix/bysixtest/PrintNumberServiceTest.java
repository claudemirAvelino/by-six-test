package com.bysix.bysixtest;

import com.bysix.bysixtest.exerciseone.service.PrintNumberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrintNumberServiceTest {

    private PrintNumberService printNumberService;

    @BeforeEach
    void setUp() {
        printNumberService = new PrintNumberService();
    }

    @Test
    void testCorrectedValue() {
        assertEquals("1", printNumberService.correctedValue(1));
        assertEquals("2", printNumberService.correctedValue(2));
        assertEquals("Visual", printNumberService.correctedValue(3));
        assertEquals("4", printNumberService.correctedValue(4));
        assertEquals("Nuts", printNumberService.correctedValue(5));
        assertEquals("Visual", printNumberService.correctedValue(6));
        assertEquals("7", printNumberService.correctedValue(7));
        assertEquals("8", printNumberService.correctedValue(8));
        assertEquals("Visual", printNumberService.correctedValue(9));
        assertEquals("Nuts", printNumberService.correctedValue(10));
        assertEquals("11", printNumberService.correctedValue(11));
        assertEquals("Visual", printNumberService.correctedValue(12));
        assertEquals("13", printNumberService.correctedValue(13));
        assertEquals("14", printNumberService.correctedValue(14));
        assertEquals("Visual Nuts", printNumberService.correctedValue(15));
    }

    @Test
    void testDivisibleByThree() {
        assertEquals("Visual", printNumberService.correctedValue(3));
        assertEquals("Visual", printNumberService.correctedValue(6));
        assertEquals("Visual", printNumberService.correctedValue(9));
        assertEquals("Visual", printNumberService.correctedValue(12));
    }

    @Test
    void testDivisibleByFive() {
        assertEquals("Nuts", printNumberService.correctedValue(5));
        assertEquals("Nuts", printNumberService.correctedValue(10));
    }

    @Test
    void testDivisibleByThreeAndFive() {
        assertEquals("Visual Nuts", printNumberService.correctedValue(15));
    }

    @Test
    void testConstantNumber() {
        int expectedNumber = 100;
        int actualNumber = PrintNumberService.NUMBER;

        assertEquals(expectedNumber, actualNumber, "Constant NUMBER should have the value 100");
    }
}
