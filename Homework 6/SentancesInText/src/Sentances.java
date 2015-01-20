import java.util.Scanner;


public class Sentances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
//		String text1 = "My name is Iliyan. I have 1 brother.";
		
		System.out.println("Enter word: ");
		String word = input.nextLine();
		
	
		String[] words = text.split("\\.");
	
		for (String string : words) {
			int contains = string.indexOf(word);
			if(contains > 0){
				System.out.println(string);
			}
		}
		
	}

	}

