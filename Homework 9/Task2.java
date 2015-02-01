import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		int[] numbers = { 17, 5, 18, 4, 9, 21 };
		// for (int i = 0; i < numbers.length; i++) {
		// System.out.printf("Enter number %d: ", i+1);
		// numbers[i] = input.nextInt();
		// }
		// System.out.println();

		int maxSum = Integer.MIN_VALUE;
		int maxSumStartIndex = -1;

		for (int i = 2; i < numbers.length; i++) {
			int currentSum = numbers[i] + numbers[i - 1] + numbers[i - 2];
			if (currentSum > maxSum) {
				maxSum = currentSum;
				maxSumStartIndex = i;
			}
		}
		System.out.printf("Максимален сбор от 3-ка поредни числа в масива: %d",
				maxSum);
		System.out.println();
		System.out.printf("Тройката числа са: %d, %d и %d",
				numbers[maxSumStartIndex], numbers[maxSumStartIndex - 1],
				numbers[maxSumStartIndex - 2]);

	}

}
