import java.math.BigDecimal;
import java.util.ArrayList;


public class SHOP {	
		

		public static void main (String[] args) {
			
			
			Laptop lap1 = new Laptop("Toshiba", new BigDecimal(1200));
			
			GSM gsm1 = new GSM("NOKIA", new BigDecimal (600));
			
			TV tv1 = new TV ("SONY BRAVIA", new BigDecimal(5000));
			
		
			ArrayList<SellableInterface> items = new ArrayList<SellableInterface>();
			items.add(lap1);
			items.add(gsm1);
			items.add(tv1);
		
			
			StoreBucket product = new StoreBucket(new BigDecimal(6500), items);
			
			
				try{
				
				
					BigDecimal money = new BigDecimal(1500);
					StoreBucket.sell(money); // защо търси static?
				}
				catch(Error e){
					System.out.println("Възникна грешка!");
				}
				
				finally{
					System.out.println("Операцията приключи");
				}
				
			}
}
			
	