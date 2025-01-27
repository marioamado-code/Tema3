package english;

import java.util.ArrayList;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// we introduce the scanner
		Scanner sc = new Scanner(System.in);
		// we introduce the constant end and the phrase
		final String end = "END";
		String words[];
		String phrase;
		ArrayList<String> frases = new ArrayList<>();
		//we ask for phrases until the phrase is end
		
		System.out.println("introduce phrase if you want to end write END");
		phrase=sc.nextLine();
		frases.add(phrase);
		while(!phrase.equals(end)) {
			
			words=phrase.split(" ");
			
			
			
			System.out.println("introduce phrase if you want to end write END");
			phrase=sc.nextLine();
			frases.add(phrase);
			
		}
		
		
			
		
		
		
		sc.close();
	}

}
