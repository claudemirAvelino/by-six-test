package com.bysix.bysixtest;

import com.bysix.bysixtest.exercisetwo.DTO.CountriesDTO;
import com.bysix.bysixtest.exercisetwo.model.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

public class CountriesDTOTest {
    private CountriesDTO countriesDTO;

    @BeforeEach
    public void setup() {
        countriesDTO = new CountriesDTO();
    }

    @Test
    public void testGetAll_ReturnsAllCountries() {
        Country[] countries = countriesDTO.getAll();
        Assertions.assertNotNull(countries);
        Assertions.assertTrue(countries.length > 0);
    }
}
