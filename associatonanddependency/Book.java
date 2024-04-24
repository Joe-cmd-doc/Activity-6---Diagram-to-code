package associatonanddependency;

import java.util.ArrayList;
import java.util.List;

public  class Book {
	
	  private List<Page> pages;
	    private Shelf shelf;
	    private Patron patron;

	    public Book(List<Page> pages, Shelf shelf, Patron patron) {
	        pages = new ArrayList<>();
	        this.patron=patron;
	        this.shelf=shelf;
	    }

	    public void addPage(Page page) {
	        pages.add(page);
	    }
	    
	    public void setShelf(Shelf shelf) {
	        this.shelf = shelf;
	    }

	    public void setPatron(Patron patron) {
	        this.patron = patron;
	    }
	
}
