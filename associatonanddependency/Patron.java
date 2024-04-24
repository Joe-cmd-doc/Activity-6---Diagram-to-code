
package associatonanddependency;

import java.util.ArrayList;
import java.util.List;

public class Patron {

	 private List<Book> books;

	    public Patron(List<Book> books) {
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

}
