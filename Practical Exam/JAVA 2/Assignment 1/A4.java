import java.util.HashMap;
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many contacts : ");
        int n = in.nextInt();

        HashMap<String, String> contactList = new HashMap<>();

        System.out.print("Enter contacts : ");
        for (int i = 0; i < n; i++)
            contactList.put(in.next(), in.next());

        System.out.println(contactList);
    }
}
