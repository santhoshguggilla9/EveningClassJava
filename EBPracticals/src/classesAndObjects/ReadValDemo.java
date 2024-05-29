package classesAndObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class school
{
	private int admn_no;
	private String s_name;
	
	public int getAdmn_no() {
		return admn_no;
	}
	public void setAdmn_no(int admn_no) {
		this.admn_no = admn_no;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

}
public class ReadValDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int admnno;
		String sname;
		
		school s1 = new school();
		
//		InputStreamReader isr = new InputStreamReader(System.in);  
//		BufferedReader br = new BufferedReader(isr);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter admn number");
//		admnno = Integer.parseInt(br.readLine());
		admnno = sc.nextInt(); // reads the integer
		sc.nextLine(); // take the enter character.
				
		System.out.println("Enter Student name");
		//sname = br.readLine();
		sname = sc.nextLine();// reads the String
		
		s1.setAdmn_no(admnno);
		s1.setS_name(sname);
		
		System.out.println(s1.getAdmn_no());
		System.out.println(s1.getS_name());
		
		sc.close();
	}
}
