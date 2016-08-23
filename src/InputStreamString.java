import java.io.*;

public class InputStreamString {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream input = new FileInputStream("./src/InputStreamString.java")){
			byte[] array = new byte[input.available()];
			input.read(array);
			String str = new String(array);
			System.out.println(str);
		}
	}

}
