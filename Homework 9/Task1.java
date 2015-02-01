public class Task1 {

	public static void main(String[] args) { // Може да се реши с HashSet.
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 5, 2, 1, 7 };
		int countSameNums = 0;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					countSameNums++;
				}
			}
		}

		System.out.printf("Number of matching numbers is %d", countSameNums);

	}

}
