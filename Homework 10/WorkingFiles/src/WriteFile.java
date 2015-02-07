import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String filePath = "C:/Users/Iliyan/workspace/WorkingFiles/output/country.txt"; 
		String filePath1 = "C:/Users/Iliyan/workspace/WorkingFiles/output/capital.txt";


		try {

			// FileWriter fileStream = new FileWriter(filePath,true);

			FileWriter fileStream = new FileWriter(filePath); // има опция
			BufferedWriter writer = new BufferedWriter(fileStream);

			String[] country = new String[5];

			for (int i = 0; i < country.length; i++) {
				System.out.println("Enter country: ");
				country[i] = input.nextLine();
				writer.write(country[i]);
				writer.newLine();
			}

			FileWriter fileStream1 = new FileWriter(filePath1); // има опция
			BufferedWriter writer1 = new BufferedWriter(fileStream1);

			String[] capital = new String[5];

			for (int i = 0; i < capital.length; i++) {
				System.out.printf("Enter capital for country %s: ", country[i]);
				System.out.println();
				country[i] = input.nextLine();
				writer1.write(country[i]);
				writer1.newLine();
			}

			writer.close();

		} catch (Exception e) {
			System.out.println("Възникна грешка при записа на файла");
			System.out.println(e.getMessage());
		}

		System.out.print("Записът на файла приключи! \n");
	}

}
