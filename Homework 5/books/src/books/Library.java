package books;
import java.util.ArrayList;
import java.util.HashMap;
public class Library {
	
	private String name;
	private String address;
	ArrayList<Copy> book = new ArrayList<Copy>();	
	
	public Library (String name, String address, HashMap<Book, Integer> kopiq) {
		
		this.name = name;
		this.address = address;
		this.book = book;
	
	

}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Copy> getBook() {
		return book;
	}

	public void setBook(ArrayList<Copy> book) {
		this.book = book;
	}
}

