import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		
		while (true) {
		Scanner input = new Scanner (System.in);
			
		System.out.println("�������� ������ �: ");
		float a = input.nextFloat(); // koga se slaga f sled chisloto?
		System.out.println();
		System.out.println("���������� ������ �: " + a);
		System.out.println();
		System.out.println("�������� ������ �: ");
		float b = input.nextFloat();
		System.out.println();
		System.out.println("���������� ������ �: " + b);
		
		float p = 2*a+2*b;
		
		System.out.println("����������� �� ������������� �: " + p);
		System.out.println();
		
		System.out.println("���������� �� ����������...");
		}
	}

}
