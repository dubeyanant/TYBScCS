import java.util.*;

class CovidPositiveException extends Exception {
	CovidPositiveException() {
		System.out.println("\nPatient is Covid Positive(+) and Need to be Hospitalized");
	}
}

class Patient {
	String name;
	int age, oLevel, hrct;
	
	Patient(String name, int age, int oLevel, int hrct) {
		this.name = name;
		this.age = age;
		this.oLevel = oLevel;
		this.hrct = hrct;
	}
}

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		
		System.out.print("Enter patient name : ");
		String name = in.nextLine();
		
		System.out.print("Enter patient age : ");
		int age = in.nextInt();
		
		System.out.print("Enter patient oxygen level : ");
		int oLevel = in.nextInt();
		
		System.out.print("Enter patient HRCT report : ");
		int hrct = in.nextInt();
		
		Patient pat = new Patient(name, age, oLevel, hrct);
		
		try {
			if (pat.oLevel < 95 && pat.hrct > 10)
            	throw new CovidPositiveException();
		} catch(CovidPositiveException e) {
			flag = false;
		}

		if(flag)
        	System.out.println("\nPatient Information\nName : " + pat.name + "\nAge : " + pat.age + "\nOxygen level : " + pat.oLevel + "\nHRCT report : " + pat.hrct);
	}
}
