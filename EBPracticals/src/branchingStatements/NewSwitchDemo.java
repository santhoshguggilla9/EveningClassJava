package branchingStatements;

public class NewSwitchDemo {

	public static void main(String[] args) {
		
		String dayName;
		int day = 3;
		
		int x=2;
		
dayName=switch(day)
		{
		
		case 1 -> "Sunday"; // Lambda Expression (->)
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "Invalid day";
		
		};
		System.out.println("The day selected: " +dayName);
		
		dayName=switch(day)
				{
				
				// Lambda Expression (->)
				case 1,2,3,4,5 -> "Weekday";
				case 6,7 -> "Weekends";
				default -> "Invalid day";
				
				};
				System.out.println("The day selected: " +dayName);
				
				int result=switch(x)
						{
						
						case 1 -> 1;
						case 2 -> {
							int sum;
							sum=x+x;
							yield sum;
						}
						default -> 0;
						
				};
				System.out.println("The result: " +result);			
	}
}
