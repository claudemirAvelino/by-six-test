package com.bysix.bysixtest.exercisetwo.service;

import com.bysix.bysixtest.exercisetwo.DTO.CountriesDTO;
import com.bysix.bysixtest.exercisetwo.model.Country;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesService {
    public long count() {
        Stream<Country> countries = Arrays.stream(new CountriesDTO().getAll());
        //if (countries.anyMatch(country -> true)) {
            return countries.count();
        //}
        //return 0;
    }

    public String mostOfficialLanguagesSpeakGerman() {
        Stream<Country> countries = Arrays.stream(new CountriesDTO().getAll());
        //if (countries.anyMatch(country -> true)) {
            return countries.filter(c -> c.getLanguages().contains("de"))
                    .reduce((o1, o2) -> (o1.getLanguages().size() > o2.getLanguages().size()) ? o1 : o2)
                    .get()
                    .getCountry();
        //}
        //return null;
    }

    public long countLanguages() {
        Stream<Country> countries = Arrays.stream(new CountriesDTO().getAll());
        //if (countries.anyMatch(country -> true)) {
            return countries.map(country -> country.getLanguages())
                    .flatMap(Collection::stream)
                    .distinct()
                    .count();
        //}
        //return 0;
    }

    public String mostOfficialLanguages() {
        Stream<Country> countries = Arrays.stream(new CountriesDTO().getAll());
        //if (countries.anyMatch(country -> true)) {
            return countries.reduce((o1, o2) -> (o1.getLanguages().size() > o2.getLanguages().size()) ? o1 : o2)
                    .get()
                    .getCountry();
        //}
        //return null;
    }

    public String mostCommonLanguage() {
        Stream<Country> countries = Arrays.stream(new CountriesDTO().getAll());
        //if (countries.anyMatch(country -> true)) {
            return countries.map(country -> country.getLanguages())
                    .flatMap(Collection::stream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .max(Comparator.comparing(Map.Entry::getValue))
                    .map(Map.Entry::getKey)
                    .get();
        //}
        //return null;
    }

    public void execute(){
        System.out.println(count());
        System.out.println(mostOfficialLanguagesSpeakGerman());
        System.out.println(countLanguages());
        System.out.println(mostOfficialLanguages());
        System.out.println(mostCommonLanguage());
    }
}
