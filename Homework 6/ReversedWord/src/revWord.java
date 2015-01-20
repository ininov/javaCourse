import java.util.Scanner;
public class revWord {

		
		public static void main(String[] args) {
					
			Scanner input = new Scanner(System.in);
			System.out.println("Enter word: ");
			String word = input.nextLine();
			
			char[] parts = word.toCharArray();
			
			
			
			for (char part : parts) {
				System.out.print(part + " ");
			}
			
			System.out.println();
			System.out.println("reversed word: ");
			
			for (int i = parts.length -1; i>=0; i--) {
				System.out.print(parts[i] + " ");
				
			}

	}


	}
