package client;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.adobe.entity.Book;

public class SetExample {
	public static void main(String[] args){
		
//		Set<Book> books = new HashSet<Book>();
//		Set<Book> books = new TreeSet<Book>();
		
		Set<Book> books = new TreeSet<Book>(Book.PRICE_COMP);
		
		books.add(new Book("A", 120.00));
		books.add(new Book("a", 125.00));
		books.add(new Book("C", 130.00));
		books.add(new Book("D", 135.00));
		
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
