import java.util.Arrays;
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[7];
		System.out.println("Enter 7 numbers");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("Enter number %d: ", i+1);
			nums[i] = input.nextInt();
		}
		
		Arrays.sort(nums);
		
		System.out.println("Enter number to search: ");
		
		int search = input.nextInt();

		int first = 0;
		int last = nums.length - 1;
		int middle = (first + last) / 2; // Integer деление, то ни трябва, за да не изпуснем

		while (first <= last) {
			
			if (nums[middle] < search){
				
				first = middle + 1;
				
			} else if (nums[middle] == search) {
				
				System.out.format("Числото %d намерено на индекс %d", search, middle);

				break;
			} else {
				
				last = middle - 1;
				
			}

			middle = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Числото не същестува в масива");
		}

	}
		

	}

