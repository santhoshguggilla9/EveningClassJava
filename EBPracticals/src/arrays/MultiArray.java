package arrays;

public class MultiArray {

	public static void main(String[] args) {
		
//		//initialisation of an array
//		int [] arr = { 10, 20, 30, 40 ,50 };
//
//		for(int i=0;i<arr.length;i++)
//			System.out.println("array Value: " +arr[i]);
//		

		//Multi dimensional array
		
		int mArray[][]= new int[2][2];// new is keyword used to allocate the memory
		
		mArray[0][0]=10;
		mArray[0][1]=20;
		mArray[1][0]=30;
		mArray[1][1]=40;
		
		System.out.println("length the of array: " +mArray.length );
		for(int i=0;i<mArray.length;i++) {
			for(int j=0;j<mArray.length;j++) {
			System.out.println("array Value: " +mArray[i][j]);
			}
		}
		
		//initialisation of multi array
		int mArray1[][]=
			             {
		                     {10 , 20},
				             {30, 40}
		                 };
		for(int i=0;i<mArray1.length;i++) {
			for(int j=0;j<mArray1.length;j++) {
			System.out.println("array Value: " +mArray1[i][j]);
			}
		}
		
	}
}
