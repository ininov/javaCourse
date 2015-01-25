import java.math.BigDecimal;
import java.util.ArrayList;


public class StoreBucket {
	
	private BigDecimal bgn;
	private ArrayList<SellableInterface> items = new ArrayList<SellableInterface>();
	




	public StoreBucket(BigDecimal bgn, ArrayList<SellableInterface> items){
		this.bgn = bgn;
		this.items = items;
	}
	
	public ArrayList<SellableInterface> getItems() {
		return items;
	}

	public void setItems(ArrayList<SellableInterface> items) {
		this.items = items;
	}

	public void sell (BigDecimal bgn) throws Error{
		if(this.bgn.compareTo(bgn) == -1){
			throw new Error("Недостатъчна наличност");
		}
	}
}

