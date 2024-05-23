package loops;

public class FibonocciDemo {

	public static void main(String[] args) {
		//Fibonocci Series - 0 1 1 2 3 5 8 13
		
		int range=50;
		
		int i=0;
		int j=1;
		int k=1;
		System.out.println(i + "\n" +j);
		
		do
		{
			System.out.println(k);
			i=j;
			j=k;
			k=i+j;

		} while(k<=range);
	}
}
