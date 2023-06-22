package com.bysix.bysixtest.exercisetwo.service;

import com.bysix.bysixtest.exercisetwo.DTO.CountriesDTO;
import com.bysix.bysixtest.exercisetwo.model.Country;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesService {
    private Stream<Country> countries;


    public CountriesService() {
        countries = Arrays.stream(new CountriesDTO().getAll());
    }

    public long count() {
        if (countries.anyMatch(country -> true)) {
            return countries.count();
        }
        return 0;
    }

    public String findMostOfficialLanguagesSpeakGerman() {
        if (countries.anyMatch(country -> true)) {
            return countries.filter(c -> c.getLanguages().contains("de"))
                    .reduce((o1, o2) -> (o1.getLanguages().size() > o2.getLanguages().size()) ? o1 : o2)
                    .get()
                    .getCountry();
        }
        return null;
    }

    public long countLanguages() {
        if (countries.anyMatch(country -> true)) {
            return countries.map(country -> country.getLanguages())
                    .flatMap(Collection::stream)
                    .distinct()
                    .count();
        }
        return 0;
    }

    public String findMostOfficialLanguages() {
        if (countries.anyMatch(country -> true)) {
            return countries.reduce((o1, o2) -> (o1.getLanguages().size() > o2.getLanguages().size()) ? o1 : o2)
                    .get()
                    .getCountry();
        }
        return null;
    }

    public String findMostCommonLanguage() {
        if (countries.anyMatch(country -> true)) {
            return countries.map(country -> country.getLanguages())
                    .flatMap(Collection::stream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .max(Comparator.comparing(Map.Entry::getValue))
                    .map(Map.Entry::getKey)
                    .get();
        }
        return null;
    }
}
