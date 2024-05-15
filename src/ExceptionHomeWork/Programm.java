package ExceptionTest;

import java.util.HashMap;
// Происходит запуск приложения
public class Programm {
	public static void main(String[] args) {
		ParsData parsData = new ParsData();
		String newFileName = null;
		CreateFile createFile = new CreateFile();
		
		HashMap<String, Object> data = parsData.parsInputData();
		while (data.size() != 6) {
			try {
				throw new DataFormatException();
			} catch (DataFormatException e) {
				data = parsData.parsInputData();
			}
		}
		
		newFileName = data.get("lastName") + ".txt";
		StringBuilder sb = new StringBuilder();
		for (String str : data.keySet()) {
			sb.append(data.get(str));
			sb.append(" ");
		}
		
		System.out.println(data);
		String filePath = newFileName;
		//System.out.println(filePath);
		createFile.createFile(String.valueOf(sb), filePath);
	}
}

