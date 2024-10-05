package cv01pr01;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadejte vas text:");
		String input = scanner.nextLine();
		scanner.close();

		String[] tokens = input.replaceAll("[.,]", " ").split("\\s+");

		System.out.println("Celkovy pocet slov je: " + tokens.length);

		// konverze potrebna pro Collections.frequency, ktera neprijima typ String[]
		List<String> listOfWords = Arrays.asList(tokens);
		Set<String> uniqueWords = new HashSet<String>(listOfWords);

		for (String w : uniqueWords) {
			System.out.println(w + " " + Collections.frequency(listOfWords, w));
		}
	}
}
