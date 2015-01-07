
public class Fruits extends Stock {
	private String vitamin;
	private String taste;
	//private int counter = 5;

	public Fruits() {
		setVitamin(vitamin);
		setTaste(taste);
	}

	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	public void info() {
		if(inStock){
		System.out.printf("This fruit has vitamin " + this.vitamin);
		System.out.print(" and it is " + this.taste);
		System.out.println();
		if (super.price < 0) {
			System.out.println("Invalid price!");
		}
		else if(super.price == 0){
			System.out.println("It is free!");
		}
		else {
			System.out.print("Price: " + super.price + " BGN.");
		}
		System.out.println();
		}
		else{
			System.out.println("The product is out of stock!");
		}

	}
}
