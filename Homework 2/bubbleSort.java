import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int[] array = new int[5];
		int num;
		boolean flag = true;
		System.out.println("You must enter 5 random numbers"
				+ " and they will be sorted in descending order!");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter Number for position %d: ", i);
			num = a.nextInt();
			array[i] = num;
		}
		System.out.println("Numbers are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		while (flag) {
			flag = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					num = array[i];
					array[i] = array[i + 1];
					array[i + 1] = num;
					flag = true;
				}
			}
		}
		System.out.println("The sorted array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
