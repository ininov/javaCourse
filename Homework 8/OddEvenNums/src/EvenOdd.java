import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int [] inputNums = new int [10];
		
		for (int i = 0; i < inputNums.length; i++) {
			System.out.printf("Enter number %d: ", i+1);
			inputNums[i] = input.nextInt();
		}
		
		int countEven = 0;
		int countOdd = 0;
		int[] even = new int [inputNums.length];
		int[] odd = new int [inputNums.length];
		
		for (int i = 0; i < inputNums.length; i++) {
			if(inputNums[i] % 2 == 0){
				even[i] = inputNums[i];
		//		countEven++;
			}
			else if(inputNums[i] % 2 > 0){
				odd[i] = inputNums[i];
			}
		}
		
		EvenSortAcs(even);
		OddSortDec(odd);
		
		for (int i = 0; i < even.length; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println();
		
		for (int j = 0; j < odd.length; j++) {
			System.out.print(odd[j] + " ");
			
		}
		
		

	}
	
	public static void EvenSortAcs(int [] num){
		
		boolean flag = true;
		int temp;
		
		while (flag){
			flag = false;
			
			for (int i = 0; i > num.length - 1; i++) {
				if(num[i] > num[i+1]){
						temp = num[i];
						num[i] = num[i+1];
						num[i+1] = temp;
						flag = true;
						}
				}
				
			}
		}
	public static void OddSortDec(int [] num){
		
		boolean flag = true;
		int temp;
		
		while (flag){
			flag = false;
			
			for (int i = 0; i < num.length - 1; i++) {
				if(num[i] > num[i+1]){
						temp = num[i];
						num[i] = num[i+1];
						num[i+1] = temp;
						flag = true;
						}
				}
				
			}
	
	
	}

}
