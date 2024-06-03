package interfaces;


interface bank
{
	public void showBank();
}
interface calcROI
{
	public void calculateInterest();
}

class sbi implements bank,calcROI //class can implement mutiple interfaces
{
	@Override
	public void calculateInterest() {
		System.out.println("the ROI is 7.8%");
		
	}
	@Override
	public void showBank() {
		System.out.println("SBI located all over india");
	}
	
}
public class MultipleInterfaces {

	public static void main(String[] args) {
		
		sbi s = new sbi();
		s.calculateInterest();
		s.showBank();
	}
}
