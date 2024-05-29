package classesAndObjects;

class car
{
	//instance varaibles or data members
	int year;
	String model;
	
	//Member function or methods
	public void readVal(int y, String m)
	{
		year=y;
		model=m;
	}
	public void printVal()
	{
		System.out.println("Car Year: " + year);
		System.out.println("Car Model: " + model);
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		
		car car1 = new car(); // creating the object
		car1.readVal(2012, "i10");
		car1.printVal();
		
		car car2 = new car();
		car2.readVal(2016, "i20");
		car2.printVal();
	}
}
