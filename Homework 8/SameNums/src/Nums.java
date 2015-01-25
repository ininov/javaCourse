import java.util.Scanner;


public class Nums {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int[] numbers = new int [30];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Enter number %d: ", i+1);
			numbers[i] = input.nextInt();
		}
		System.out.println();
		
		int countCouples = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				
				int first = numbers[i];
				int second = numbers[j];
				
				if(first == second){
					countCouples++;
					break;
				}
			}
		}
		
		System.out.println("Брой двойки: " + countCouples);

	}

}
