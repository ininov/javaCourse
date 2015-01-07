package taskShop;
import java.util.Random;
import java.util.Scanner;

public class Shop {
	private String place;
	private String name;

	public Shop() {
		setPlace(place);
		setName(name);
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		int [][] array = new int[5][1];
			
			for (int i = 0; i < array.length; i ++){
				if(i == 0){
					System.out.print("Месо: ");
				}
				else if (i == 1){
					System.out.print("Зеленчуци: ");
				}
				else if (i == 2){
					System.out.print("Плодове: ");
				}
				else if (i == 3){
					System.out.print("Напитки: ");
				}
				else if (i == 4){
					System.out.print("Десерт: ");
				}
				
				for (int j = 0; j < array[i].length; j++){
					Random rand = new Random();
					array[i][j] = rand.nextInt(10);
					System.out.print(array[i][j]);
				}
				System.out.println(" бр.;");
				
			}
			
			addProduct(array);
			
	}
			public static void addProduct(int [][] array){
				for (int i = 0; i<array.length; i++){
					for(int j = 0; j < array[i].length; j++){
						int temp;
						Scanner input = new Scanner(System.in);
						System.out.println("How much products you want to add?");
						temp = input.nextInt();
						
						array[i][j] = array[i][j+temp];
					}
				}
				}
				
				
				
				


	}

