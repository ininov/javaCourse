import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		
		String [] words = new String[4];
		
		for(int i = 1; i<=words.length; i++){
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter word %d:",i);
			words[i] = input.nextLine();
			
		}
		for (int i=0; i<words.length; i++){
			for(int j=0; j<i; j++){
			if(words[i].equals(words[j])){
				System.out.print(words[i]+" ");
					
				}
			
			}
	}
		
}
}