import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Set;

public class AlphabetOrder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		
		
		System.out.println("Type text: ");
		
		String string = input.nextLine();
		
		String[] words = string.split("\\s+");
		
		System.out.println(words.length);
		
		ArrayList<String> array = new ArrayList<String>();	
		
		Arrays.asList(words);
		
		Collections.sort(array);
		
		
		
		for(String word : array){
			
			if(wordsCount.get(word)==null){
				wordsCount.put(word, 1);
		} else 	{
			
			Integer count = wordsCount.get(word);
			wordsCount.put(word, count+1);
			}
		}
		
		Set<String> keys = wordsCount.keySet();
		
		for (String w : keys){
			
			int count = wordsCount.get(w);
			
			if(count >= 1){
				System.out.printf("%s \n", w);
		}
		}
		}


	}

