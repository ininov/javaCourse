import java.util.Random;

public class functions {

	public static void main(String[] args) {

		Random rand = new Random();

		for (int row = 0; row < 10; row++) {
			float side = rand.nextFloat();
			float height = rand.nextFloat();
			float areaTriangle = triangle(side, height);
			sysout(side, height, areaTriangle);
		}
	}

	public static float triangle(float side, float height) {
		float areaTriangle = (side * height) / 2;
		return areaTriangle;
	}

	public static void sysout(float side, float height, float areaTriangle) {
		System.out.printf("Width %f Height %f = Area %f", side, height,
				areaTriangle);
		System.out.println();
	}
}
