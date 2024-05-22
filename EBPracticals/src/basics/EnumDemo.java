package basics;

public class EnumDemo {
	public enum day
	{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}
	public enum status
	{
		eligible,
		not_eligible,
		no_status
	}
	public static void main(String[] args) 
	{
		day today = day.MONDAY;
		day day_after_tomorrow = day.valueOf("WEDNESDAY"); //valueOf() method picks the selected value from the enum
		status s1= status.not_eligible;
		
		System.out.println("Today is: " +today);
		System.out.println("Day after tomorrow is: " + day_after_tomorrow);
		System.out.println("student s1: " +s1);

	}
}
