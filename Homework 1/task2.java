import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		System.out.println("Number 1: ");
		int a = input.nextInt();
		System.out.println("Number 2: ");
		int b = input.nextInt();
		System.out.println("Number 3: ");
		int c = input.nextInt();
		System.out.println("Entered numbers are: " + "a:" + a + " " + "b:" + b
				+ " " + "c:" + c);
		if (a < b && a < c) {
			System.out.println(a + " is the smallest number!");
		} else if (b < a && b < a) {
			System.out.println(b + " is the smallest number!");
		} else if (c < a && c < b) {
			System.out.println(c + " is the smallest number!");
		}

	}
}
