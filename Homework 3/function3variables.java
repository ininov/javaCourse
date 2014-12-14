import java.util.Random;


public class function3variables {
	

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		for (int i = 0; i < 20; i++){
			int one = rand.nextInt(100);
			int two = rand.nextInt(100);
			int three = rand.nextInt(100);
			
			multiply(one, two, three);
		}
		System.out.println();

	
	}
	
	public static int multiply(int one, int two, int three){
				
		int result = one*two*three;		
		System.out.printf("%d * %d * %d = %d ", one, two, three, result);
		System.out.println();
				
		return result;
	}

}
