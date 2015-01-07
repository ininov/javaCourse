import java.util.Scanner;
public class CeltoFar {

	
	public static int formula(int cel){
		int far = (cel*(9/5)) + 32;
		return far;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Celsius temperature: ");
		int cel = input.nextInt();
		
		System.out.println("Calculating...");
		
		int far = formula(cel);
		
		System.out.printf("%d Celsius is %d Fahrenheit",cel, far);
	}

}
