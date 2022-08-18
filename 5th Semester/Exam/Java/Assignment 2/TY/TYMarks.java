package TY;

import java.util.*;

public class TYMarks {
    public int tm, pm;

    public void get() {
    	Scanner in = new Scanner(System.in);
    	
        System.out.print("Enter marks of the theory out of 400 and practicals out of 200 : ");
        
        tm = in.nextInt();
        pm = in.nextInt();
    }
}
