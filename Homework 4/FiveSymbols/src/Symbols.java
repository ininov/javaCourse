import java.util.Scanner;
public class Symbols {

		
	public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			int counter = 0;
			System.out.println("Enter 5 symbol word: ");
			
			String word=input.nextLine();
			
			if(word.length()>5){
				
				System.out.println("Invalid word!");
			}
			
			char[] wordSymbols = word.toCharArray();
			
			char [] symbol= new char[5];
			
			System.out.println("Enter 5 symbols: ");
			
						
			for(int i=0; i < symbol.length; i++){
				System.out.printf("Enter symbol %d: ", i);
				symbol[i]=input.next().charAt(0);
			}
			
			for (char one: wordSymbols){
				System.out.print(one + " ");
			}
			System.out.println();
			for (char two: symbol){
				System.out.print(two + " ");
			}
			System.out.println();
			
			word(wordSymbols,symbol,counter);
	}
	
	
	public static void word(char[] wordSymbols, char [] symbol, int counter){
		
		for (int i = 0; i < symbol.length; i++) {
			
			if(symbol[0] == wordSymbols[i] || symbol[1] == wordSymbols[i]
			|| symbol[2] == wordSymbols[i] || symbol[3] == wordSymbols[i] || symbol[4] == wordSymbols[i]){
			System.out.println("Valid symbol ");
			counter++;
			}
			else{
			System.out.println("Invalid symbol.");
			
			}
			
	}
		System.out.println();
		if (counter == 5){
			System.out.println("Word can be assembled");
		}
		else {
			System.out.println("Word can't be assembled");
		}
	

}
}
