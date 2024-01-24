package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("C:\\java\\abc.txt",true);
		String str="We are Learning File Handling. ";
		byte barray[]=str.getBytes();
		outputStream.write(barray);
		outputStream.close();
		System.out.println("File is Created...");
	}

}
