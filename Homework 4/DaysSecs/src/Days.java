import java.util.Scanner;


public class Days {
	private static final int minute = 60;
	private static final int minutesInhour = 60;
	private static final int hoursInDay = 24;
	
	public static int formula(int day){
		int days = day*hoursInDay*minutesInhour*minute;
		return days;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int day = input.nextInt();
		if (day < 1) {
			System.out.println("Invalid number! Please restart program");
		}
		else{
			int secondsInDays = formula(day);
		System.out.printf("There are %d seonds in %d days.", secondsInDays, day);
		
		}
	

	}

}
