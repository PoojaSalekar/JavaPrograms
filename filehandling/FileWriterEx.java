package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\java\\xyz.txt",true);
		writer.write("Welcome to Edubridge. ");
		writer.close();
		System.out.println("File is Created...");
	}

}
