package classesAndObjects;

class birds
{
	private int b_id;
	private String b_name;
	private double price;
	
	
	public void readVal(int bid,String bname,double p)
	{
		b_id = bid;
		b_name = bname;
		price = p;
	}
	public void printVal()
	{
		System.out.println("bird id: " +b_id);
		System.out.println("bird name: " +b_name);
		System.out.println("bird price: " +price);
	}
}
public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		
		birds b1,b2,b3; 
		
		b1 = new birds();
		b2 = new birds();
		b3 = new birds();
		
		b1.readVal(1, "parrot", 100.00);
		b1.printVal();
		
		b2.readVal(2, "sparow", 200.00);
		b2.printVal();
		
		b3.readVal(3, "peacock", 500.00);
		b3.printVal();
	}
}
