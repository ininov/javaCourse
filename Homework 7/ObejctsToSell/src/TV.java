import java.math.BigDecimal;


public class TV extends Product implements SellableInterface {

	
	private String model;
	private BigDecimal price;
	
	public TV(String model, BigDecimal price){
		this.name = "product";
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "You have successfully purchased" + super.toString() + " " + this.model + " at the price of " + this.price;
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}
}
