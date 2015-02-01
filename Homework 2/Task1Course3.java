import java.util.Scanner;

public class Task1Course3 {

	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter number 1: ");
		// int a = input.nextInt();
		// System.out.println("Enter number 2: ");
		// int b = input.nextInt();
		//
		// for (int i = 1; i <= 100; i++) {
		// if (i % a == 0 || i % b == 0) {
		// System.out.println("Числата са: " + i);
		// }
		// }

		/*
		 * while(i<=100){
		 * 
		 * if (i % 7==0 || i % 11 == 0) System.out.println("Числата са: " + i);
		 * i++;}
		 */

		int i = 1;
		do {
			if (i % 7 == 0 || i % 11 == 0) {
				System.out.println("Числата са: " + i);
			}
			i++; // da e izvun if
		} while (i <= 100);
	}
}
