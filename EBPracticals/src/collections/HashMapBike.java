package collections;

import java.util.HashMap;
import java.util.Map;

class bikes
{
	private int model;
	private String bname;
	
	bikes(int model,String bname)
	{
		this.model=model;
		this.bname=bname;
	}
	public void showBike()
	{
		System.out.println("Bike Model: " +model);
		System.out.println("Bike Name: " +bname);
	}
}
public class HashMapBike {

	public static void main(String[] args) {
		
		bikes honda = new bikes(2021,"Honda");
		bikes ktm = new bikes(2023,"KTM");
		bikes activa = new bikes(2024,"Activa");
		
		Map<Integer, bikes> bikeRoom = new HashMap<Integer,bikes>();
		
		bikeRoom.put(111, honda);
		bikeRoom.put(112, ktm);
		bikeRoom.put(113, activa);
		
		System.out.println(bikeRoom.keySet());
		
		for(Map.Entry<Integer, bikes> bike : bikeRoom.entrySet())
		{
			int key = bike.getKey();
			System.out.println("Key is: " +key);
			bikes b = bike.getValue();
			b.showBike();
		}
	}
}
