import java.util.Scanner;

class Ab {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);

        System.out.print("Enter no. of Student : ");
        int n = Integer.parseInt(br.nextLine());

        Student p[] = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Roll no : ");
            int roll = Integer.parseInt(br.nextLine());

            System.out.print("Enter Name : ");
            String name = br.nextLine();

            System.out.print("Enter percentage : ");
            float per = Float.parseFloat(br.nextLine());

            p[i] = new Student(roll, name, per);
        }

        Student.sortStudent(p, Student.count);
        br.close();
    }
}

class Student {
    int rollno;
    String name;
    float per;
    static int count;

    Student(int roll, String n, float p) {
        count++;
        rollno = roll;
        name = n;
        per = p;
    }

    void display() {
        System.out.println(rollno + "\t" + name + "\t" + per);
    }

    float getper() {
        return per;
    }

    public static void sortStudent(Student s[], int n) {

        for (int i = n - 1; i >= 0; i--)
            for (int j = 0; j < i; j++)
                if (s[j].getper() > s[j + 1].getper()) {
                    Student t = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = t;
                }

        System.out.println("\nRoll no.|Name|Percentage");
        for (int i = 0; i < n; i++)
            s[i].display();
        System.out.println("");
    }
}