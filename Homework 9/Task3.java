public class Task3 {

	public static void main(String[] args) {

		int[] numbers = { 1, 17, 3, 5 };

		int sum = 20;
		int maxSum = 0;
		int maxSumStartIndex;

		for (int i = 0; i < numbers.length; i++) {
			int currentSum = maxSum + numbers[i];
			maxSum = currentSum;
			if (maxSum > sum) {
				maxSumStartIndex = i;
			} else if (maxSum == sum) {
				System.out.println("Desired sum is found!");
				System.out.println(maxSum);
			}
		}
	}
}
