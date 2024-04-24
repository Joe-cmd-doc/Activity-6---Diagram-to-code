package associatonanddependency;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

	 private List<Book> books;

	    public Shelf(List<Book>Book) {
	    	
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

}
