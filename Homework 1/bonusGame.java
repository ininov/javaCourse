import java.util.Scanner;

public class bonusGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your points: ");
		double res = input.nextDouble();

		if (res < 1 || res > 9) {
			System.out.println("Invalid points!");
		} else if (res >= 1 && res <= 3) {
			res *= 5;
			System.out.println("Result + bonus is: " + res);
			System.out.println("Cogratulations !!!");
		} else if (res >= 4 && res <= 6) {
			res *= 10;
			System.out.println("Result + bonus is: " + res);
			System.out.println("Cogratulations !!!");
		} else if (res >= 7 && res <= 9) {
			res *= 50;
			System.out.println("Result + bonus is: " + res);
			System.out.println("Cogratulations !!!");
		}
	}

}
