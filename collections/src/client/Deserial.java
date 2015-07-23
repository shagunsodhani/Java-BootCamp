package client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.adobe.entity.Book;

public class Deserial {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream("books.data"); 
		ObjectInputStream in = new ObjectInputStream(fin);
		Book b = (Book) in.readObject();
		System.out.println(b.getTitle());
	}

}
