import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Sentance {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter sentance and check for unique words: ");
		
		String sentance = input.nextLine();
		
		String[] words = sentance.split("\\s");
		
		System.out.println(words);
		
			HashMap<String,Integer> code = new HashMap<String,Integer>();
			
			for(String word:words){
				
				if(code.get(words)==null){
										
					code.put(word, 1);}
										
				else{
					Integer temp = code.get(word);
					code.put(word, temp+1);
									}
					}
			
		Set<String> keys = code.keySet();
		for (String word : keys)
		{
		int count = code.get(word);
		if(count==1)
		System.out.printf("%s -> %d пъти\n", word, count);
		}
		}

	}


