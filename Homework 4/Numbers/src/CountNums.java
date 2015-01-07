import java.util.Scanner;


public class CountNums {

	public static void main(String[] args) {
		

int [] nums = new int[10];
		
		for(int i = 1; i<=nums.length; i++){
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter num %d:",i);
			nums[i] = input.nextInt();
			
		}
		for (int i=0; i<nums.length; i++){
			
			if(nums[i]-nums[i-1]==1){
				System.out.print(nums[i]+" ");
					
				}
			
			}
	}
		
}

