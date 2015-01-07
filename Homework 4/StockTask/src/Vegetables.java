
public class Vegetables extends Stock {
	private String origin;
	private String size;
	//private int counter = 5;

	public Vegetables() {
		setOrigin(origin);
		setSize(size);
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
	public void info() {
		if(inStock){
		System.out.printf("A " + this.size);
		System.out.print(" vegetable from " + this.origin);
		System.out.println();
		if (super.price < 0) {
			System.out.println("Invalid price!");
		} else {
			System.out.print("at price of " + super.price + " BGN.");
		}
		System.out.println();
		}
		else{
			System.out.println("The product is out of stock!");
		}

	}
}
