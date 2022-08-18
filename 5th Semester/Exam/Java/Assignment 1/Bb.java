public class Test {
	private int n;
	
		/** Default constructor */
	public Test() {
		n = 0;
		
		if(isNegative(n))
			System.out.println(n + " is negative.");
		if(isPositive(n))
			System.out.println(n + " is positive.");
		if(isZero(n))
			System.out.println(n + " is zero.");
		if(isOdd(n))
			System.out.println(n + " is odd.");
		if(isEven(n))
			System.out.println(n + " is even.");
	}
	
		/**
			@param n takes an integer value
		*/
	public Test(int n) {
		this.n = n;
		
		if(isNegative(n))
			System.out.println(n + " is negative.");
		if(isPositive(n))
			System.out.println(n + " is positive.");
		if(isZero(n))
			System.out.println(n + " is zero.");
		if(isOdd(n))
			System.out.println(n + " is odd.");
		if(isEven(n))
			System.out.println(n + " is even.");
	}
	
		/**
			@param n takes an integer
			@return boolean value of either true or false
		*/
	public static boolean isNegative(int n) {
		return n < 0;
	}
	
		/**
			@param n takes an integer
			@return boolean value of either true or false
		*/
	public static boolean isPositive(int n) {
		return n > 0;
	}
	
		/**
			@param n takes an integer
			@return boolean value of either true or false
		*/
	public static boolean isZero(int n) {
		return n == 0;
	}
	
		/**
			@param n takes an integer
			@return boolean value of either true or false
		*/
	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}
	
		/**
			@param n takes an integer
			@return boolean value of either true or false
		*/
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
		/**
			@param args from command line
		*/
	public static void main(String[] args) {
		Test obj = new Test(Integer.parseInt(args[0]));
	}
}
