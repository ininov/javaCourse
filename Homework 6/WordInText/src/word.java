import java.util.Scanner;
public class word {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = input.nextLine();
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		System.out.printf("Finding word %s... ", word);
		
		System.out.println("Replacing word with Upper case one...");
		
		String newWord = word.toUpperCase();
		String newText = text.replace(word, newWord);
		
		System.out.println("New sentence is: ");
		System.out.println(newText);
	}

}
