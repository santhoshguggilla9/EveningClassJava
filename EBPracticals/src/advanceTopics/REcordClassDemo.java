package advanceTopics;

import java.util.Objects;


record animal(int id, String name) { 
	
	public animal()  	//canonical constructor
	{
		this(0,"");	
	}
	animal(int id, String name)
	{
		this.id =id;
		this.name=name;
	}
}
public class REcordClassDemo {

	public static void main(String[] args) {
			
		animal a1 = new animal(101,"cat");
		animal a2 = new animal(102,"tiger");
		animal a3 = new animal();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	
		System.out.println(a1.equals(a2));
	}
}
