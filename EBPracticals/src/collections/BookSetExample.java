package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class books
{
	private int bid;
	private String bname;
	
	books(int bid, String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}
	public void showbook()
	{
		System.out.println("Book ID: " +bid);
		System.out.println("Book name: " +bname);
	}
}
public class BookSetExample {

	public static void main(String[] args) {
			
		books java = new books(101,"Java");
		books selenium = new books(102,"Selenium");
		books cucumber = new books(103,"cucumber");
		
		Set<books> bookSet = new HashSet<books>();
		
		bookSet.add(java);
		bookSet.add(selenium);
		bookSet.add(cucumber);
		
		Iterator<books> itr = bookSet.iterator();
		while(itr.hasNext())
		{
			books book = itr.next();
			book.showbook();
		}

	}

}
