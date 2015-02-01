public class Task4 {

	public static void main(String[] args) {
		String word = "Iliyan";
		char[] letters = word.toCharArray();

		for (int i = 0; i < letters.length; i++) {
			System.out.printf("Letter: %s is on index [%d].", letters[i], i);
			System.out.println();
		}
	}
}
