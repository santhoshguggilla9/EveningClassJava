package loops;

public class WhileSample {

	public static void main(String[] args) {
		
		String name = "Guggilla Santhosh Kumar";
		
		String reverse=reverseword(name);
		System.out.println(reverse);
}
	public static String reverseword(String str)
	{
		char[] letters = str.toCharArray();
		
		int left=0;
		int right= letters.length-1;
		
		while(left<right) {
			
			char temp=letters[left];
			letters[left]=letters[right];
			letters[right]=temp;
			
			left++;
			right--;
		}
		return new String(letters);
		
	}
}
