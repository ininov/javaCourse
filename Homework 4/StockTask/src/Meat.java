public class Meat extends Stock {
	private String color;
	private String expDate;
	//private int counter = 5;

	public Meat() {
		setColor(color);
		setExpDate(expDate);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	
	public void info() {
		if(inStock){
		System.out.print(this.color + " meat");
		System.out.println();
		if (super.price < 0) {
			System.out.println("Invalid price!");
		} else {
			System.out.print("at price of " + super.price + " BGN.");
		}
		System.out.println();
		System.out.printf("Expiration date is %s", this.expDate);
		System.out.println();

	}
		else{
			System.out.println("Product is out of stock!");
		}

}
}