import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class DataBase {
	Scanner sc=new Scanner(System.in);
	TreeSet<Book> bookSet;

	public DataBase() {
		
		bookSet=new TreeSet<Book>();
		
		Book b1= new Book(1,"Data Structure","kk",450);
		Book b2= new Book(2,"c++","Sekhar",500);
		Book b3= new Book(3,"Java","Bishal",234);
		Book b4= new Book(4,"Ruby","Sreeram",790);
		Book b5= new Book(5,"c#","Basudev",450);
		
		
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		bookSet.add(b5);
		
	}
	
	public void viewAll() {
		
		Iterator<Book> itr = bookSet.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
	
	public Book viewName(String name) {
		
	{
		for(Book b:bookSet)
			if(b.title.equals(name)) {
				return b;
			}
		}
	return null;
	}
	
	
	public void insert(Book b) {
		bookSet.add(b);
		System.out.println("data inseted");
	}
	
	
	
	  public void delete(int id1) {
	  
	  Iterator<Book> itr = bookSet.iterator();
	  if(id1==itr.next().bookId)
	  {
	  itr.remove(); 
	  System.out.println("Book deleted"); 
	  } 
		
		  else { 
			  System.out.println("no book found by this id");
			  }
		 
	  }
	 
	
	
	public void update(int id2,double price) {
		Iterator<Book> itr = bookSet.iterator();
		while(itr.hasNext()) {
			Book bTemp = itr.next();
			if(bTemp.bookId==id2) {
				String title=bTemp.title;
				String author=bTemp.author;
				itr.remove();
				Book b=new Book(id2,title,author,price);
				bookSet.add(b);
				System.out.println("details updated");
			}
		}
	}
}
