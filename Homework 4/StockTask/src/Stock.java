
public abstract class Stock {
	protected int price;
	protected boolean inStock = true;
	
	
	public Stock(){
		setPrice(price);
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		this.price = price;
		
		}
		
	
	public abstract void info();
}
