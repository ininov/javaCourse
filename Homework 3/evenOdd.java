import java.util.Random;


public class evenOdd {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i<5; i++){
			int number = rand.nextInt(100);
			
			System.out.println(number);
			check(number);
		}
	}
		

	
	public static void check (int number){
				
		if(number % 2 == 0){
			System.out.println("Числото е четно!");	
	}
		else{
			System.out.println("Числото е нечетно!");
		}

}
}