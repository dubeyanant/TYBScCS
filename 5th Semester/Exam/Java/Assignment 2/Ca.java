import StringOp.*;
import java.util.Scanner;

public class Ca {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first string : ");
		String str1 = in.nextLine();
		System.out.print("Enter second string: ");
		String str2 = in.nextLine();
		
		System.out.println("\nConcatenated string is : " + Con1.con(str1, str2));
		
		if(Comp.comp(str1, str2))
			System.out.println("Both strings are same.");
		else
			System.out.println("Both strings are not same.");
	}
}
