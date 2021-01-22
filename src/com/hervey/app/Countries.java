package com.hervey.app;

public class Countries {

	public static void main(String[] args) {

		// 1. Declare 4 arrays and initialize them to the given values.
		// Countries: China, Egypt, France, Germany, India, Japan, Kenya, Mexico, United
		// Kingdom, United States
		// Capitals: Beijing, Cairo, Paris, Berlin, New Delhi, Tokyo, Nairobi, Mexico
		// City, London, Washington D.C.
		// Languages: Chinese, Arabic, French, German, Hindi, Japanese, Swahili,
		// Spanish, English, English
		// Filenames for map images: China.jpg, Egypt.jpg, France.jpg, Germany.jpg,
		// India.jpg, Japan.jpg, Kenya.jpg, Mexico.jpg, UK.jpg, US.jpg

		// 2. Pick a random number up to the length of one of the arrays and save in the
		// variable index

		// 3. Print out the info in each array using the random index

		// Example of showing image files using an array called images (your array name
		// above may be different)
		// (this will only work in Active Code)
		// Countries obj = new Countries();
		// obj.printHTMLimage( images[index] );

		Countries country = new Countries();
		country.printHTMLimage("China.jpg");

		// This method will just work in Active Code which interprets html

		String[] countryNames = { "China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States" };
		String[] countryCapitals = { "Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C." };
		String[] countryLanguages = { "Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English" };
		String[] countryMapFilenames = { "China.jpg", "Egypt.jpg", "France.jpg", "Germany", "India.jpg", "Japan.jpg", "Kenya", "Mexico.jpg", "UK.jpg", "US.jpg" };
		Integer[] countryPopulation = {55,66,77,88,99,22,11,21,32,43};
		
		
//		 testing arrays are full and same length
//		 System.out.println(countryNames.length==countryCapitals.length &&
//		 countryCapitals.length==countryLanguages.length &&
//		 countryLanguages.length==countryMapFilenames.length);
		int lengthArray = countryNames.length;

		int index = fetchRandomIndex(lengthArray);

		// testing output proper for all countries
/*		for (int i = 0; i < lengthArray; i++) {
			country.outputCountryInformation(i, countryNames[i], countryCapitals[i], countryLanguages[i], countryMapFilenames[i]);
			System.out.println();
		}
*/
		country.outputCountryInformation(index, countryNames[index], countryCapitals[index], countryLanguages[index], countryPopulation[index]);

	}

	private static int fetchRandomIndex(int max) {
		int min = 0;
		return (int) ((Math.random() * (max - min)) + min);
	}

	public String printHTMLimage(String filename) {
		String baseURL = "https://raw.githubusercontent.com/bhoffman0/CSAwesome/master/_sources/Unit6-Arrays/6-1-images/";
		return "<img src=" + baseURL + filename + ">";
	}

	public void outputCountryInformation(int indexCountry, String countryName, String countryCapital, String countryLanguage, Integer countryPopulation) {
		System.out.println("This country's index is:  " + indexCountry);
		System.out.println("This country's capital is:  " + countryCapital);
		System.out.println("This country's language is:  " + countryLanguage);
		System.out.println("This country's population is:  " + countryPopulation);

	}

}