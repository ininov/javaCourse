import java.util.Scanner;
public class highestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int[5];
		int num;
		
		for(int i = 0; i<arr.length; i++ ){
			System.out.printf("Position %d: ", i);
			num = input.nextInt();
			arr[i]=num;
		}
		System.out.println("Numbers are: ");
		for(int i = 0; i < arr.length; i++){
			
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
			if(arr[0]>arr[1] && arr[0] > arr[2] && arr[0]>arr[3] && arr[0] > arr[4]){
				System.out.println("The biggest number is: " + arr[0] );
			}
			else if(arr[1]>arr[0] && arr[1] > arr[2] && arr[1]>arr[3] && arr[1] > arr[4]){
				System.out.println("The biggest number is: " + arr[1] );
			}
			else if (arr[2]>arr[0] && arr[2] > arr[1] && arr[2]>arr[3] && arr[2] > arr[4]){
				System.out.println("The biggest number is: " + arr[2] );
		}
			else if (arr[3]>arr[0] && arr[3] > arr[1] && arr[3]>arr[2] && arr[3] > arr[4]){
				System.out.println("The biggest number is: " + arr[3] );
	}
			else if (arr[4]>arr[0] && arr[4] > arr[1] && arr[4]>arr[2] && arr[4] > arr[3]){
				System.out.println("The biggest number is: " + arr[4] );

}
	}
}
