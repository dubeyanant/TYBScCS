import java.util.*;

interface PrintCube {
	double print(double n);
}

class Cube implements PrintCube {
	public double print(double n) {
		return n * n * n;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cube obj = new Cube();
		
		System.out.print("Enter a number : ");
		double n = in.nextDouble();
		
		System.out.println("Cube of " + n + " : " + obj.print(n));
	}
}
