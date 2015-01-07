import java.util.Scanner;
public class CountWords {
		
	    public static int cntWords(String str)
	    {
	    	
	    	String words[] = str.split(" ");
	        int count = words.length;
	        return count;
	            
	        
	    }
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = in.next();
	        System.out.print("Your sentence has " + cntWords(sentence) + " words.");
	    }
	}



