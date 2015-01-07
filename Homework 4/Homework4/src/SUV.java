
public class SUV extends Car {
	private boolean fxf;
	
	public SUV (boolean fxf, float price){
		setFxf(fxf);
	}
	
	public boolean getFxf(){
		return fxf;
	}
	public void setFxf(boolean fxf){
		this.fxf = fxf;
	}
}
