import java.util.Scanner;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int size = input.nextInt();
		
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			
			System.out.printf("Enter number %d", i+1);
			System.out.println();
			
			array[i] = input.nextInt();
		}

		Arrays.sort(array);
		
		System.out.print("Sorted array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
		

	}

