import java.util.*;

class InvalidDateException extends Exception {
	InvalidDateException() {
		System.out.println("Invalid Date!");
	}
}

class MyDate {
	static int day, month, year;
	
	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	static void display() {
		System.out.println(day + "/" + month + "/" + year + " is valid");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		
		System.out.print("Enter date as dd mm yyyy : ");
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		
		try {
			if(month >= 1 && month <= 12) {
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if(!(day >= 1 && day <= 31))
						throw new InvalidDateException();
				} else if(month == 2) {
					if(year % 4 == 0) {
						if(!(day >= 1 && day <= 29))
							throw new InvalidDateException();
					} else if(year % 4 != 0) {
						if(!(day >= 1 && day <= 28))
							throw new InvalidDateException();
					}
				} else {
					if(!(day >= 1 && day <= 30))
						throw new InvalidDateException();
				}
			} else
				throw new InvalidDateException();
				
		} catch(InvalidDateException e) {
			flag = false;
		}
		
		if(flag) {
			MyDate obj = new MyDate(day, month, year);
			MyDate.display();
		}
	}
}
