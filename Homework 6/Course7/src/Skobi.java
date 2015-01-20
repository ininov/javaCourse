
public class Skobi {

	public static void main(String[] args) {
		
		String math = "4 * (5 - 2) + 6/((2 * (2 + 15))";
		
		
		
		char[] charArray = math.toCharArray();
		
		System.out.print(charArray);
		int counter = 0;
		for (int i = 0; i<charArray.length; i++){
			
			if(charArray[i] == '('){
				counter = counter+1;
				
			}
			else if(charArray[i] == ')'){
				counter = counter-1;
			}
			
			
			
			
		}
		
		System.out.println();
		if(counter == 0){
		System.out.println("Skobite sa OK");
		}
		else{
			System.out.println("Error");
		}
		
		
		

	}

}
