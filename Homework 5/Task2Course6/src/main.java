import java.util.HashSet;
public class main {

	public static void main(String[] args) {
		
		Town t1 = new Town("Sofia", "Bulgaria", 400);
		Town t2 = new Town("Pleven", "Bulgaria", 300);
		Town t3 = new Town("Dobrich", "Bulgaria", 200);
		
		HashSet<Town> town = new HashSet<Town>();
		
		town.add(t1);
		town.add(t2);
		town.add(t3);
		
		for (String i: town){
			
		}
	}

}
