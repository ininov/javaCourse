public class changeV {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;

		System.out.println("Values before swap: ");
		System.out.print("a:" + a + "\t");
		System.out.println("b:" + b);
		System.out.println("Swapping values.....");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Values after swap: ");
		System.out.print("a:" + a + "\t");
		System.out.println("b:" + b);

	}

}
