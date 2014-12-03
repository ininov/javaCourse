import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		
		while (true) {
		Scanner input = new Scanner (System.in);
			
		System.out.println("Въведете страна А: ");
		float a = input.nextFloat(); // koga se slaga f sled chisloto?
		System.out.println();
		System.out.println("Въведената страна е: " + a);
		System.out.println();
		System.out.println("Въведете страна Б: ");
		float b = input.nextFloat();
		System.out.println();
		System.out.println("Въведената страна е: " + b);
		
		float p = 2*a+2*b;
		
		System.out.println("Периметърът на правоъгълника е: " + p);
		System.out.println();
		
		System.out.println("Програмата се рестартира...");
		}
	}

}
