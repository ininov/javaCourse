public class rowsCols {

	public static void main(String[] args) {

		int rows = 4;
		int cols = 5;
		int counter = 1;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(counter++ + " ");
			}
			System.out.println();
		}
	}
}
