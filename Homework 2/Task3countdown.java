public class Task3countdown {

	public static void main(String[] args) {

		int rows = 5;
		int cols = 6;
		int counter = 30;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(counter-- + " ");
			}
			System.out.println();
		}

	}

}
