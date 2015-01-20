import java.util.Scanner;


public class FindWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = input.nextLine();
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		String[] words = text.split(" |,|\\.");
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			
			if(words[i].equals(word)){
				counter++;
			}
			
		}
		
		System.out.printf("Finding word %s... ", word);
		
		System.out.println();
		
		System.out.printf("Found %d matches",counter);
		
	}

}
