public class multiArr {

	public static void main(String[] args) {

		String[][] menu = new String[][] {
				new String[] { "�������", "������", "�������" },
				new String[] { "�������", "������ ����", "������ ����",
						"������� �����", "�������", "������" },
				new String[] { "������� ������", "��������" } };

		for (int i = 0; i < menu.length; i++) {
			if (i == 0) {
				System.out.println("����: ");
			} else if (i == 1) {
				System.out.println("�������: ");
			} else if (i == 2) {
				System.out.println("�������: ");
			}
			for (int j = 0; j < menu[i].length; j++) {
				System.out.print(menu[i][j] + ",");
			}
			System.out.println(); // finish
		}

	}
}