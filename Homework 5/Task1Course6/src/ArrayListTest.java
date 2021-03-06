import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Company> companies = new ArrayList<Company>();

		Company com1 = new Company("Apple", "USA", "www.apple.com", 4000);
		Company com2 = new Company("Toshiba", "Japan", "www.toshiba.com", 2000);
		Company com3 = new Company("Toyota", "Somewhere", "www.toyota.com",1000);
		Company com4 = new Company("Huawei", "China", "www.huawei.com", 10000);
		Company com5 = new Company("OLX", "Bulgaria", "www.olx.bg", 10);
		Company com6 = new Company("Unknown", "Unknown", "Unknown", 0);

		companies.add(com1);
		companies.add(com2);
		companies.add(com3);

		int maxEmployees = 0;
		int nameIndex = 0;

		for (int i = 0; i < companies.size(); i++) {

			if (companies.get(i).getNumEmployees() > maxEmployees) {
				nameIndex = i;
				maxEmployees = companies.get(i).getNumEmployees();
			}

		}

		System.out.printf(
				"Company with the most personel is %s with %d employees.",
				companies.get(nameIndex).getName(), maxEmployees);
		
		int maxLength = 0;
		int lengthIndex = 0;
		
		for (int i = 0; i < companies.size(); i++) {

			if (companies.get(i).getName().length() > maxLength ) {
				lengthIndex = i;
				maxLength = companies.get(i).getName().length();
			}

		}
		companies.remove(companies.get(lengthIndex));
		companies.add(com4);
		companies.add(com5);
		
		companies.set(lengthIndex, com6);
		
		System.out.println(companies);
		

	}

}
