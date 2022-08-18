import java.util.*;

class Student {
	int rno;
	String name;
	float per;
	
	Student(int rno, String name, float per) {
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	
	static void sortStudent(Student[] stu, int n) {
		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				if(stu[j].per < stu[i].per) {
					Student temp = stu[j];
					stu[j] = stu[i];
					stu[i] = temp;
				}
	}
}

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many student objects : ");
		int n = in.nextInt();
		
		Student[] stu = new Student[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("\nEnter details of student no " + (i + 1) + "\nRoll no : ");
			int rno = in.nextInt();
			in.nextLine();
			System.out.print("Name : ");
			String name = in.nextLine();
			System.out.print("Percentage : ");
			float per = in.nextFloat();
			
			stu[i] = new Student(rno, name, per);
		}
		
		Student.sortStudent(stu, n);
		
		System.out.println("\n\nAfter sorting : ");
		display(stu, n);
	}
	
	private static void display(Student[] stu, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("\nRollno : " + stu[i].rno + "\nName : " + stu[i].name + "\nPercentage : " + stu[i].per);
		}
	}
}
