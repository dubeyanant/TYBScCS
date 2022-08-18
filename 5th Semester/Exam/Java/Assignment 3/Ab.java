import java.util.*;

abstract class Staff {
	protected int id;
	protected String name;
	
	Staff(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class OfficeStaff extends Staff {
	String dept;
	
	OfficeStaff(int id, String name, String dept) {
		super(id, name);
		this.dept = dept;
	}
	
	private static void display(OfficeStaff[] obj, int n) {
		System.out.println("\nID\tName\t\tDeptartment name");
		
		for(int i = 0; i < n; i++) {
			System.out.println(obj[i].id + "\t" + obj[i].name + "\t" + obj[i].dept);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter value of n : ");
		int n = in.nextInt();
		
		OfficeStaff[] obj = new OfficeStaff[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("\nEnter id : ");
			int id = in.nextInt();
			in.nextLine();
			
			System.out.print("Enter name : ");
			String name = in.nextLine();
			
			System.out.print("Enter department name : ");
			String dept = in.nextLine();
			
			obj[i] = new OfficeStaff(id, name, dept);
		}
		
		display(obj, n);
	}
}
