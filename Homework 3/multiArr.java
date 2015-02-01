public class multiArr {

	public static void main(String[] args) {

		String[][] menu = new String[][] {
				new String[] { "Пилешка", "Шкембе", "Таратор" },
				new String[] { "Пържола", "Умряло пиле", "Кисело зеле",
						"Пилешки хапки", "Змийско", "Заешко" },
				new String[] { "Плодова салата", "Сладолед" } };

		for (int i = 0; i < menu.length; i++) {
			if (i == 0) {
				System.out.println("Супи: ");
			} else if (i == 1) {
				System.out.println("Основни: ");
			} else if (i == 2) {
				System.out.println("Десерти: ");
			}
			for (int j = 0; j < menu[i].length; j++) {
				System.out.print(menu[i][j] + ",");
			}
			System.out.println(); // finish
		}

	}
}