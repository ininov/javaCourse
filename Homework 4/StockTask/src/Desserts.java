
public class Desserts extends Stock{
		private String name;
		private String temp;
		//private int counter = 5;

		public Desserts() {
			setName(name);
			setTemp(temp);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTemp() {
			return temp;
		}

		public void setTemp(String temp) {
			this.temp = temp;
		}
		
		
		public void info() {
			if(inStock){
			System.out.printf("This is " + this.name);
			System.out.print(" and it is " + this.temp + "dessert.");
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


