import java.util.Scanner;

public class list {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		System.out.println("���������� �� ���������");
		System.out.println("�������� �������� �����:");
		System.out.print("���: ");
		String name1 = text.nextLine();
		System.out.print("�������: ");
		String name2 = text.nextLine();
		System.out.print("�������: ");
		String name3 = text.nextLine();
		Scanner other = new Scanner(System.in); // pri izpolzvaneto na razlichni
												// tipove danni s 1 scanner se
												// poluchava bug v programata.
		System.out.print("��� (�/�): ");
		char sex = other.next().charAt(0);
		System.out.print("�������: ");
		int age = other.nextInt();
		if (age < 0 || age > 120) {
			System.out.println("��������� �������!");
		}
		System.out.print("���: ");
		String egn = text.nextLine();
		int egnLngth = egn.length();
		if (egnLngth < 10 || egnLngth > 10) {
			System.out.println("��������o ���!");
		}
		System.out.print("����� (08���): ");
		String gsm = text.nextLine();
		int gsmLngth = gsm.length();
		if (gsmLngth < 10 || gsmLngth > 10) {
			System.out.println("��������o ���!");
		}
		System.out.println();
		System.out.println("���������� �������� �: ");
		System.out.println("���: " + name1 + " " + name2 + " " + name3);
		System.out.println("���: " + sex);
		/* System.out.println("�������: " + age); */
		System.out.println("���: " + egn);
		System.out.println("�����: " + gsm);

	}
}
