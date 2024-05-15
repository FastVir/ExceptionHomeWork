package ExceptionTest;

import java.util.Scanner;

public class InputData {
	public String[] inputData() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
			String data;
			data = scanner.nextLine();
			//String[] arrayData = data.split(" ");
			if (data.isEmpty()) {
				throw new EmptyStringException("Строка является пустой: Введите строку через ПРОБЕЛ\n (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m )");
			}
			
			data = data.replaceAll("\\s+", " ");
			data = data.trim();
			String[] array = data.split(" ");
			if (array.length == 6) {
				return array;
			} else if (array.length < 6) {
				System.out.println("Вы ввели не все данные.");
			} else {
				throw new ArrayCountElementException("Вы ввели не все данные или\n"
						+ "Вы пропустили пробел");
			}
			
		}
	}
}
