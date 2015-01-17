
public class Company {
	private String name;
	private String address;
	private String webPage;
	private int numEmployees;
	
	public Company(String name, String address, String webPage, int numEmployees){
		this.name = name;
		this.address = address;
		this.webPage = webPage;
		this.numEmployees = numEmployees;
		
		
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

	public String getWebPage() {
		return webPage;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}

	public int getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	
	public void info(){
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.webPage);
		System.out.println(this.numEmployees);
	}
}
