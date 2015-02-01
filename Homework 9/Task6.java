import java.util.HashSet;


public class Task6 {

	public static void main(String[] args) {
		
		String symbols = "gggsssssttttrrrr";
		char[] symbol = symbols.toCharArray();
		int symbolCounter = 0;
		
			
		for (int i = 1; i <= symbol.length; i++) {
			if(symbol[i] == symbol[i-1]){
				symbolCounter++;
			}else if(symbol[i] != symbol[i-1]){
				System.out.println(symbol[i-1]);
			}
		}
	}

}
