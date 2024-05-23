package loops;

public class ForDemo {

	public static void main(String[] args) {
		
		int x=1;
		
//		for(x=1;x<=10;x++) {
//			System.out.println(x);
//		}
//		for(;x<=10;x++) {
//			System.out.println(x);
//		}
			
		for(;x<=10;) {
			System.out.println(x);
			x++;
		}
		System.out.println("\n");
		for(int y=10;y>=1;y--) {
			System.out.println(y);
		}
	}

}
