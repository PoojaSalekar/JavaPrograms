package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/* created by Pooja Salekar*/

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\java\\ser.txt"));
		Employee employee = (Employee) objectInputStream.readObject();
		System.out.println(employee);
		objectInputStream.close();
	}

}
