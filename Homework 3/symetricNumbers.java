
public class symetricNumbers {

	public static void main(String[] args) {
		
		
		int num1 = 0;
		
		symNum1(num1);
		
		
		

	}
	
	public static void symNum1(int num1){
		for (num1 = 0; num1 <= 999; num1++){
			
			if (num1<10){
				System.out.print(num1 + " ");
			}
			
		
		if (num1 >=10 && num1 <=99 && num1 % 11 == 0 ){
			System.out.println(num1 + " ");}
		
		if (num1 >=100 && num1 <= 199 && num1 % 10 == 1){
			System.out.println(num1 + " ");
		}
		
		
		if (num1 >= 200 && num1<=299 && num1 % 10 == 2){
			System.out.println(num1 + " ");
		}
		
		
		if (num1 >= 300 && num1<=399 && num1 % 10 == 3){
			System.out.println(num1 + " ");
		}
		
		
		if (num1 >= 400 && num1<=499 && num1 % 10 == 4){
			System.out.println(num1 + " ");
		}
		
		
		if (num1 >= 500 && num1<=599 && num1 % 10 == 5){
			System.out.println(num1 + " ");
		}
		
		if (num1 >= 600 && num1<=699 && num1 % 10 == 6){
			System.out.println(num1 + " ");
		}
		
		if (num1 >= 700 && num1<=799 && num1 % 10 == 7){
			System.out.println(num1 + " ");
		}
		
		if (num1 >= 800 && num1<=899 && num1 % 10 == 8){
			System.out.println(num1 + " ");
		}
		
		if (num1 >= 900 && num1<=999 && num1 % 10 == 9){
			System.out.println(num1 + " ");
		}
	}

}
}
