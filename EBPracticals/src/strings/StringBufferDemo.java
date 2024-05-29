package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb);
		//System.out.println(sb.hashCode());
		
		// Method append
		sb.append("java");
		System.out.println(sb);
		
		// Method insert
		sb.insert(6, "test");
		System.out.println(sb);
		
		//	Method reverse
//		sb.reverse();
//		System.out.println(sb);
		
		//	Method length
		int size = sb.length();
		System.out.println(size);
		
		// Method delete
		sb.delete(6, 10);
		System.out.println(sb);
		
		// Method replace
		sb.replace(0, 5, "Hi");
		System.out.println(sb);
		
		// Method capacity
		int cap = sb.capacity();
		System.out.println(cap);
	}

}
