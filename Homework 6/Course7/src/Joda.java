
public class Joda {

	public static void main(String[] args) {
		
			String sentance = "My name is Iliyan, by the way.";
			
			String[] parts = sentance.split(" |,|\\.");
			
			
			
			for (String part : parts) {
				System.out.println(part);
			}
			
			System.out.println();
			System.out.println("reversed sentence: ");
			
			System.out.println();
			for (int i = parts.length -1; i>=0; i--) {
				System.out.println(parts[i]);
				
			}

	}

}
