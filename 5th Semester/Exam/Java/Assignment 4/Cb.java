import java.util.*;

class InvalidNameException extends Exception {
	InvalidNameException() {
		System.out.println("Name is invalid!");
	}
}

class Employee {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
	
		System.out.print("Enter employee name : ");
		String name = in.nextLine();
		
		try {
			for(int i = 0; i < name.length(); i++)
				for(int j = 48; j <= 57; j++)
					if(name.charAt(i) == j)
						throw new InvalidNameException();

		} catch(InvalidNameException e) {
			flag = false;
		}
		
		if(flag)
			System.out.println("Name is valid!");
	}
}
