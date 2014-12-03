import java.util.Scanner;
public class triangle {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Въведете 3 числа: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a<b+c && b<a+c && c<b+a){
			System.out.println("С числата може да се образува триъгълник");
		}else {
			System.out.println("Не може да се образува триъгълник");
		}
	}
	
}
