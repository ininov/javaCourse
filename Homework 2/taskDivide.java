import java.util.Scanner;
public class taskDivide {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Number 2: ");
		int num2 = input.nextInt();
		
		if(num1>num2){
			System.out.println("Invalid combination! Restart");
		}
		else if(num1<num2){
			System.out.print("Числата делящи се на 3 са: ");
			while(num1<num2){
					if(num1 % 3==0){
					System.out.print(num1 + " ");
				}
					num1++;	
					}
			
			}
		}
	}