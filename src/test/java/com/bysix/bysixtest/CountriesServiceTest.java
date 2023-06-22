package com.bysix.bysixtest;

import com.bysix.bysixtest.exercisetwo.DTO.CountriesDTO;
import com.bysix.bysixtest.exercisetwo.model.Country;
import com.bysix.bysixtest.exercisetwo.service.CountriesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CountriesServiceTest {
    private CountriesService countriesService;
    private Country[] countries;

    @BeforeEach
    public void setup() {
        countriesService = new CountriesService();
    }

    @Test
    public void testCount_ReturnsNumberOfCountries() {
        CountriesService countriesService = new CountriesService();

        long count = countriesService.count();

        Assertions.assertEquals(5, count);
    }

    @Test
    public void testMostOfficialLanguagesSpeakGerman_ReturnsCountryWithMostGermanSpeakers() {
        CountriesService countriesService = new CountriesService();

        String country = countriesService.mostOfficialLanguagesSpeakGerman();

        Assertions.assertEquals("BE", country);
    }

    @Test
    public void testCountLanguages_ReturnsNumberOfDistinctLanguages() {
        CountriesService countriesService = new CountriesService();

        long count = countriesService.countLanguages();

        Assertions.assertEquals(6, count);
    }

    @Test
    public void testMostOfficialLanguages_ReturnsCountryWithMostOfficialLanguages() {
        CountriesService countriesService = new CountriesService();

        String country = countriesService.mostOfficialLanguages();

        Assertions.assertEquals("BE", country);
    }

    @Test
    public void testMostCommonLanguage_ReturnsMostCommonLanguage() {
        CountriesService countriesService = new CountriesService();

        String language = countriesService.mostCommonLanguage();

        Assertions.assertEquals("de", language);
    }
}
