import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Въведете 3 числа: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		boolean check = a < b + c;
		boolean check1 = b < a + c;
		boolean check2 = c < b + a;
		
		if (check && check1 && check2 == true) {
			System.out.println("С числата може да се образува триъгълник");
		} else {
			System.out.println("Не може да се образува триъгълник");
		}
	}

}
