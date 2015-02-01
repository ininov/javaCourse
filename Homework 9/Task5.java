import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		String number = input.nextLine();
		char[] digits = number.toCharArray();

		for (int i = digits.length - 1; i >= 0; i--) {
			System.out.print(digits[i] + " ");
		}
	}
}
