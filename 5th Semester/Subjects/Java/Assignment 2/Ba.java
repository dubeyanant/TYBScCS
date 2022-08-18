import TY.*;
import java.io.*;

class StudentInfo {

    int rollno;
    String name, grade;
    public float gt, tyt, syt;
    public float per;

    public void get() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter roll number and name of the student: ");
        rollno = Integer.parseInt(br.readLine());
        name = br.readLine();
    }
}

public class Ba {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of students:");
        int n = Integer.parseInt(br.readLine());

        SYMarks sy[] = new SYMarks[n]; // creating array for n number of students in SYMarks class
        TYMarks ty[] = new TYMarks[n];

        StudentInfo si[] = new StudentInfo[n]; // creating an object name si of class StudentInfo

        for (int i = 0; i < n; i++) {
            si[i] = new StudentInfo();
            sy[i] = new SYMarks();
            ty[i] = new TYMarks();

            si[i].get(); // these three get functions are three different get functions
            sy[i].get();
            ty[i].get();

            si[i].syt = sy[i].ct + sy[i].et + sy[i].mt; // calculating total marks of SY
            si[i].tyt = ty[i].pm + ty[i].tm; // calulating total marks of TY
            si[i].gt = si[i].syt + si[i].tyt; // calculating net total marks
            si[i].per = (si[i].gt / 1200) * 100; // calculating percentage based on net total marks

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
        System.out.println("Roll No\tName\tSyTotal\tTyTotal\tGrandTotal\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(si[i].rollno + "\t" + si[i].name + "\t" + si[i].syt + "\t" + si[i].tyt + "\t" + si[i].gt
                    + "\t\t" + si[i].per + "\t\t" + si[i].grade);
        }
    }
}