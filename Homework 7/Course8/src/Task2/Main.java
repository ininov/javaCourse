package Task2;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Consumer con1 = new Consumer();
		
		System.out.println("Enter email: ");
		con1.setEmail(input.nextLine());
		
		System.out.println("Enter password: ");
		con1.setPassword(input.nextLine());
		
		System.out.println(con1);		
	}

}
