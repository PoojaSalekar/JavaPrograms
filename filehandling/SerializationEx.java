package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		Employee employee = new Employee(101,"Riya","Programmer");
		
		//ObjectOutputStream objectOutputStream = new  ObjectOutputStream(new FileOutputStream("C:\\java\\ser.txt"));
		
		FileOutputStream outputStream= new FileOutputStream("C:\\java\\ser.txt");
		ObjectOutputStream objectOutputStream = new  ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("Converted employee object into byte stream...");
	}

}
