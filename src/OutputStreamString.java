import java.io.*;
public class OutputStreamString {

	public static void main(String[] args) {
		//close don't necessary
		//try (FileOutputStream output = new FileOutputStream("file1.txt")){	
		try (FileOutputStream output = new FileOutputStream("file1.txt",true)){	
			String str = "privet \n hello";
			//String str = "Zdraste";
			byte[] array = str.getBytes();
			output.write(array);
		} catch (Exception e) {
			
		}
	}

}
