import java.util.Scanner;

public class cCards {



	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String [] card = {"1", "2", "3", "4", "5", "6","7","8","9","10","J","Q","K","A"};
		
		System.out.println("Enter card number: ");
		int temp = input.nextInt();
		for (int i = 0; i < card.length; i++){
			
			if(temp==i){
				if(temp>=1 && temp <=13){
					System.out.println(temp + " refers to " + card[i] + " Clubs");
				}
				else if(temp>=14 && temp <=26){
					System.out.println(temp + " refers to " + card[i] + " Diamonds");
			}
				else if(temp>=27 && temp<=39){
					System.out.println(temp + " refers to " + card[i] + " Hearts");
				}
				else if(temp>=40 && temp <= 52){
					System.out.println(temp + " refers to " + card[i] + " Spades");
				}
		}
	}
		
	}
}


