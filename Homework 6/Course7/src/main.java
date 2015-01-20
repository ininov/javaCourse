import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>();

		Student st1 = new Student("Iliyan", "Ninov", "121212108", "56");
		Student st2 = new Student("Plamen", "Chakalov", "121212074", "52");
	

		student.add(st1);
		student.add(st2);
		
		for(String check:student){
		System.out.println("\n" + student.toString());
		

			
		}
	}


