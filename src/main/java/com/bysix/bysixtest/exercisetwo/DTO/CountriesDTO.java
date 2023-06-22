package com.bysix.bysixtest.exercisetwo.DTO;

import java.io.File;
import java.io.IOException;

import com.bysix.bysixtest.exercisetwo.model.Country;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CountriesDTO {
	private ObjectMapper objectMapper;
	private File jsonFile;
	private Country[] countries;

	public CountriesDTO() {
		objectMapper = new ObjectMapper();
		String absolutePath = new File("").getAbsolutePath();
		jsonFile = new File(absolutePath + "\\src\\main\\java\\com\\bysix\\bysixtest\\exercisetwo\\constants\\countries.json");
		countries = new Country[0];

		try {
			countries = objectMapper.readValue(jsonFile, Country[].class);

			for (Country country : countries) {
				System.out.println("Country: " + country.getCountry());
				System.out.println("Languages: " + country.getLanguages());
				System.out.println();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Country[] getAll () {
		return this.countries;
	}
}
