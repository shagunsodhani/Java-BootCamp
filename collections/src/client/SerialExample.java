package client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.adobe.entity.Book;

public class SerialExample {
	
	public static void main(String[] args) throws IOException{
		FileOutputStream fout = new FileOutputStream("books.data"); 
		ObjectOutputStream out = new ObjectOutputStream(fout);
		Book b = new Book("alele", 123);
		
		out.writeObject(b);
		out.close();
		fout.close();
	}

}
