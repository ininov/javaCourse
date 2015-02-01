import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Integer myInt = null; myInt = 3; String word = "hello";
		 * 
		 * System.out.println("My message is " + word);
		 * 
		 * System.out.println("Number is: " + myInt);
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter text: ");
		String text = input.nextLine();
		System.out.println("You entered:  " + text);
		System.out.println();
		System.out.println("Enter number 1: ");
		int num1 = input.nextInt();
		System.out.println("Number 1 is: " + num1);
		System.out.println();
		System.out.println("Enter number 2: ");
		int num2 = input.nextInt();
		System.out.println("Number 2 is: " + num2);
		System.out.println();

		int lnght = text.length();

		if (lnght == 10) {
			System.out.println("String length is 10.");
		} else {
			System.out.println("String length differs from 10");
		}
		if (num1 > num2) {
			System.out.println("Number 1 is bigger than number 2.");
		} else if (num1 < num2) {
			System.out.println("Number 2 is higher or equal to number 1.");
		}

		System.out.println("Dimension [-100;15) . ");
		System.out.println(num2 < 15 && num2 >= -100);

		int ost = num1 % num2;
		System.out.println("The result is: " + ost);
		boolean log = num1 > 10 || num2 < 88;
		System.out.println("Number 1>10 or Number 2<88: " + log);
	}

}
