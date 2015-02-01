import java.util.Scanner;

public class list {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		System.out.println("Информация за служители");
		System.out.println("Въведете следните данни:");
		System.out.print("Име: ");
		String name1 = text.nextLine();
		System.out.print("Презиме: ");
		String name2 = text.nextLine();
		System.out.print("Фамилия: ");
		String name3 = text.nextLine();
		Scanner other = new Scanner(System.in); // pri izpolzvaneto na razlichni
												// tipove danni s 1 scanner se
												// poluchava bug v programata.
		System.out.print("Пол (м/ж): ");
		char sex = other.next().charAt(0);
		System.out.print("Възраст: ");
		int age = other.nextInt();
		if (age < 0 || age > 120) {
			System.out.println("Невалидна възраст!");
		}
		System.out.print("ЕГН: ");
		String egn = text.nextLine();
		int egnLngth = egn.length();
		if (egnLngth < 10 || egnLngth > 10) {
			System.out.println("Невалиднo ЕГН!");
		}
		System.out.print("Номер (08ххх): ");
		String gsm = text.nextLine();
		int gsmLngth = gsm.length();
		if (gsmLngth < 10 || gsmLngth > 10) {
			System.out.println("Невалиднo ЕГН!");
		}
		System.out.println();
		System.out.println("Въведеният служител е: ");
		System.out.println("Име: " + name1 + " " + name2 + " " + name3);
		System.out.println("Пол: " + sex);
		/* System.out.println("Възраст: " + age); */
		System.out.println("ЕГН: " + egn);
		System.out.println("Номер: " + gsm);

	}
}
