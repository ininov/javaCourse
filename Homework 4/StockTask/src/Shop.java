import java.util.Random;
public class Shop {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Meat meat1 = new Meat();
		meat1.setColor("White");
		meat1.setExpDate("03.02.2015");
		meat1.setPrice(rand.nextInt(10));
		meat1.info();
		
		System.out.println("============================");
		
		Vegetables vege = new Vegetables();
		vege.setOrigin("Australia");
		vege.setSize("big");
		vege.setPrice(rand.nextInt(20));
		vege.info();
		
		System.out.println("============================");
		
		Fruits fruit = new Fruits();
		fruit.setVitamin("E");
		fruit.setTaste("sweet");
		fruit.setPrice(rand.nextInt(20));
		fruit.info();
		
		System.out.println("============================");
		
		Drinks drink = new Drinks();
		drink.setName("Wiskey");
		drink.setEffect("strong");
		drink.setPrice(rand.nextInt(1000));
		drink.info();
		
		System.out.println("============================");
		
		Desserts dessert = new Desserts();
		dessert.setName("Fruit salad");
		dessert.setTemp("cold");
		dessert.setPrice(rand.nextInt(10));
		dessert.info();
	}

}
