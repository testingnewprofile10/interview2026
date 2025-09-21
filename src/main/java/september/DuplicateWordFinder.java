package september;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {

		String input = "Tata,Swift,Audi,Mercedes,Tata,Renault";

		String[] word = input.split(",");

		Set<String> uniqWord = new HashSet<>();

		for (String words : word) {

			uniqWord.add(words.trim());

		}

		for (String words : uniqWord) {

			System.out.println("Uniq Words are : " + words);

		}

	}

}
