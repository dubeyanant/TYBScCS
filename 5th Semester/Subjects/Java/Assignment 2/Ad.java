import java.util.Scanner;

public class Ad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String first = in.next();
        String middle = in.next();
        String last = in.next();

        middle = middle.substring(0, 1).toUpperCase() + middle.substring(1);

        System.out.println("Your name : " + last + " " + first + " " + middle);
        in.close();
    }
}
