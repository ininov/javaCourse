
public class Drinks extends Stock {
	private String name;
	private String effect;
	//private int counter = 5;

	public Drinks() {
		setName(name);
		setEffect(effect);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	
	public void info() {
		if(inStock){
		System.out.printf("This is " + this.name);
		System.out.print(" and it is " + this.effect);
		System.out.println();
		if (super.price < 0) {
			System.out.println("Invalid price!");
		} else {
			System.out.print("Price: " + super.price + " BGN.");
		}
		System.out.println();
		}
		else{
			System.out.println("The product is out of stock!");
		}

	}
}

