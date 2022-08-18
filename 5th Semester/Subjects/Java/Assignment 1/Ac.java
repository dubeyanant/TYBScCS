import java.util.Scanner;

public class Ac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(
                "1.Calculate the volume of cylinder\n2.Find the factorial of given number\n3.Check the number is Armstrong or not\n4.Exit\n\nEnter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the cylinder: ");
                int radius = in.nextInt();

                System.out.print("Enter height of the cylinder: ");
                int height = in.nextInt();

                System.out.println("Volume of the cylinder is: " + 3.14 * radius * radius * height);
                break;

            case 2:
                System.out.print("Enter a number: ");
                int num = in.nextInt();
                System.out.println("Factorial of " + num + " is " + fact(num));
                break;

            case 3:
                System.out.print("Enter a number: ");
                int n = in.nextInt();
                if (arm(n))
                    System.out.println(n + " is an Armstrong number");
                else
                    System.out.println(n + " is not Armstrong number");
                break;

            case 4:
                System.out.println("Exit!");
                break;

            default:
                System.out.println("Enter a valid choice!");
        }
        in.close();
    }

    static int fact(int num) {
        if (num < 2)
            return num;
        else
            return num * fact(num - 1);
    }

    static boolean arm(int n) {
        int num = n;
        int result = 0;

        while (num > 0) {
            result = result + ((num % 10) * (num % 10) * (num % 10));
            num /= 10;
        }

        if (result == n)
            return true;
        else
            return false;
    }
}
