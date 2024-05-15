package ExceptionTest;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public void createFile(String data, String path) {
		System.out.println(path);
		System.out.println(path.getClass().getSimpleName());
		try(FileWriter fw = new FileWriter(path, true)) {
			fw.append(data);
			fw.append("\n");
//			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
