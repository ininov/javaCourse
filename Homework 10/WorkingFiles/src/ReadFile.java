import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {

	public static void main(String[] args) {
		readFile("C:/Users/Iliyan/workspace/WorkingFiles/files/students.txt");

	}

	public static void readFile(String path) {
		ArrayList<Student> array = new ArrayList<Student>();

		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) { // ��������� ���� ��� ��� �� ������
				String line = bufferedReader.readLine(); // ����� ����
				String[] newLine = line.split(" ");
				Student st = new Student(newLine[0], newLine[1]);
				array.add(st);
			}
			System.out.println(array.toString());
			bufferedReader.close(); // ������������� �� �������
		} catch (Exception e) {
			System.out.println("Възникна грешка при четенето на файла");
			System.out.println(e.getMessage());
		}
	}
}
