import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class task1 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter: ");
		
		String abc = input.next();
		
		char[] arr = abc.toCharArray();
		
		Stack<String> myStack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		
		for (char c : arr) {
			String currentChar = Character.toString(c);
			
			if(currentChar.equals(currentChar.toUpperCase())){
				myStack.push(currentChar);
			}
			else if(currentChar.equals(currentChar.toLowerCase())){
				queue.add(currentChar);
			}
		}
		
		System.out.println("Данните в STACK са: ");
while(!myStack.isEmpty()){
			
			String current = myStack.pop();
			
			System.out.println(current);
		
	}
System.out.println("Данните в QUEUE са: ");
while (!queue.isEmpty()) {
		
    	System.out.println(queue.remove());
		
	}
	
	

}
}
