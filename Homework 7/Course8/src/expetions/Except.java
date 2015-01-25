package expetions;

import java.util.Scanner;
public class Except {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter number 1: ");
		double a = input.nextDouble();
		
		System.out.println("Enter number 2: ");
		double b = input.nextDouble();
		
		try{
			double result  = a/b;
			
			System.out.println(result);
			System.out.println("Success!");
		}
		catch (Exception e){
			System.out.println("Failure");
		}
	}

}
