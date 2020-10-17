import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		DataBase db = new DataBase();
		char b;
		do {
			
			System.out.println("press 1 to view all books");
			System.out.println("press 2 to view by books name");
			System.out.println("press 3 to insert ");
			System.out.println("press 4 to to delete ");
			System.out.println("press 5 to update details");
			
			int choice=sc.nextInt();
			switch (choice) {
			
			case 1:
				db.viewAll();
				break;
				
			case 2:
				System.out.println("enter the title of the book");
				String name = sc.next();
				Book rb=db.viewName(name);
				System.out.println(rb);
				break;
				
			case 3:
				System.out.println("enter the book id");
				int id=sc.nextInt();
				System.out.println("enter the book name");
				String title=sc.next(); 
				System.out.println("enter book price");
				double price=sc.nextDouble();
				System.out.println("enter author name");
				String author=sc.next();
				Book ib=new Book(id,title,author,price);
				db.insert(ib);
				break;
			
			  case 4: 
			  System.out.println("enter id of the book that you want to delete");
			  int id1=sc.nextInt(); 
			  db.delete(id1);
			  break;
			 
				
			case 5:
				System.out.println("enter the update id");
				int id2=sc.nextInt();
				System.out.println("enter the update book price");
				double price1=sc.nextDouble();
				db.update(id2,price1);
				break;
				
			default:
				break;
			}
			System.out.println("press Z to go for all menu");
			b=sc.next().charAt(0);
		}
		while(b=='Z'||b=='z');
			}

}
