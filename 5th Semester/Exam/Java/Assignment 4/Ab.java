import java.io.*;
import java.util.*;

class Ab {
    public static void main(String[] args) throws Exception {
        FileReader cap = new FileReader("sample.txt");
    	Scanner in = new Scanner(cap);
        
        System.out.println("Original file content in upper case :");
        while (in.hasNext()) {
            StringBuilder ch = new StringBuilder();
            
            ch.append((in.next()).toUpperCase());
            System.out.print(ch + " ");
        }
        System.out.println();
        cap.close();
        
        FileReader rev = new FileReader("sample.txt");
    	in = new Scanner(rev);
    
    	System.out.println("Original file content in reversed order :");
        while (in.hasNext()) {
            StringBuilder ch1 = new StringBuilder();
            
            ch1.append(in.next());
            System.out.print(ch1.reverse() + " ");
        }
        System.out.println();
        rev.close();   
    }
}
