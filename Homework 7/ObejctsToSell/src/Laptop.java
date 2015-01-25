import java.math.BigDecimal;


public class Laptop extends Product implements SellableInterface {

	private BigDecimal price;
	private String model;
	
	



	public Laptop(String model, BigDecimal price){
		
		this.name = "product";
		this.model = model;
		this.price = price;
	}
	
	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "You have successfully purchased" + super.toString() + " " + this.model + " at the price of " + this.price;
		
	}


	@Override
	public void sell() {
		
	}
}
