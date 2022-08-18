package SY;

import java.util.*;

public class SYMarks {
	public int ct, mt, et;
	
	public void get() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter marks for computer, maths and electronics out of 200 : ");
		
		ct = in.nextInt();
		mt = in.nextInt();
		et = in.nextInt();
	}
}
