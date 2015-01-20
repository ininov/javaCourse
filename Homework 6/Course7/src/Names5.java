import java.util.ArrayList;


public class Names5 {

	public static void main(String[] args) {
		
		String[] names = {"Iliyan", "Ivan", "Blagoi","Plamen", "Kiril"};
		String sen = "Iliyan has nothing to say to Plamen, but Ivan and Blagoi think about Kiril";
		
		for (String string:names ) {
			if(sen.startsWith(string)){
				System.out.printf("Sentance starts with %s ", string);
			}
			
			
		}
		
		
		
		

	}

}
