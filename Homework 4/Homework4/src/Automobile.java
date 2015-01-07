
public class Automobile extends Car {
	private String fuelConsumption;
	
	public Automobile (int price, String fuelConsumption){
		setFuel(fuelConsumption);
		setPrice(price);
		
	}
	public String getFuel(){
		return fuelConsumption;
	}
	
	public void setFuel(String fuelConsumption){
		this.fuelConsumption = fuelConsumption;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	public void info(){
		System.out.printf("Car's price is %d.", price );
		System.out.println();
		System.out.printf("Car's fuel consumption is %s", fuelConsumption);
	}

}
