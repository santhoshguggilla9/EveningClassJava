package packageDemo;

public class driver implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving");
		
	}

	@Override
	public void stop() {
		System.out.println("stopping");
		
	}
	
}
