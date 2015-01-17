import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
public class Words {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = new String[4];
		
		System.out.println("Enter 20 words: ");
		
		for(int i = 0; i < 4; i++){
			System.out.printf("Word %d: ",i+1);
			words[i] = input.nextLine();
		}
		
		HashMap<String, Integer> code = new HashMap<String, Integer>();
		
		for (String word:words){
			Integer calc = code.get(word);	
			if(code == null){	
				calc = 0;}
			code.put(word, calc+1);
			}
		
		System.out.println(code);
		
		Set<String> keys = code.keySet();
		
		for(String w:keys){
			int count = code.get(w);
			System.out.printf("%s -> %d пъти\n", w, count);
		}
		}

	}


