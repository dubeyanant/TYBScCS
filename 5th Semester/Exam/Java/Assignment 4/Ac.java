import java.io.*;
import java.util.*;

class Ac {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter name of source file : ");
		String src = in.next();
		System.out.print("Enter name of destination file : ");
		String des = in.next();
		
		FileReader srcFile = new FileReader(src);
		FileWriter desFile = new FileWriter(des);
		
		Scanner read = new Scanner(srcFile);
		
		while(read.hasNext() != false)
			desFile.write(read.next() + " ");
		
		desFile.append("\nEnd of file!");
		System.out.println("Copying finished!");
		
		srcFile.close();
		desFile.close();
	}
}
