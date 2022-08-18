import TY.*;
import SY.*;
import java.util.*;

class StudentInfo {

    int rollno;
    String name, grade;
    public float gt, tyt, syt;
    public float per;

    public void get() {
    	Scanner in = new Scanner(System.in);

        System.out.print("\nEnter roll number : ");
        rollno = in.nextInt();
        in.nextLine();
        
        System.out.print("Enter name : ");
        name = in.nextLine();
    }
}

public class Ba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total number of students : ");
        int n = in.nextInt();

		StudentInfo si[] = new StudentInfo[n];
        SYMarks sy[] = new SYMarks[n];
        TYMarks ty[] = new TYMarks[n];

        for (int i = 0; i < n; i++) {
            si[i] = new StudentInfo();
            sy[i] = new SYMarks();
            ty[i] = new TYMarks();

            si[i].get();
            sy[i].get();
            ty[i].get();

            si[i].syt = sy[i].ct + sy[i].et + sy[i].mt; // calculating total marks of SY
            si[i].tyt = ty[i].pm + ty[i].tm; // calulating total marks of TY
            si[i].gt = si[i].syt + si[i].tyt; // calculating net total marks
            si[i].per = si[i].gt / 12; // calculating percentage based on net total marks

            if (si[i].per >= 70)
                si[i].grade = "A";
            else if (si[i].per >= 60)
                si[i].grade = "B";
            else if (si[i].per >= 50)
                si[i].grade = "C";
            else if (si[i].per >= 40)
                si[i].grade = "Pass";
            else
                si[i].grade = "Fail";

        }
        
        System.out.println("Roll No\tName\t\tSyTotal\tTyTotal\tGrandTotal\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(si[i].rollno + "\t" + si[i].name + "\t" + si[i].syt + "\t" + si[i].tyt + "\t" + si[i].gt
                    + "\t\t" + si[i].per + "\t\t" + si[i].grade);
        }
    }
}
