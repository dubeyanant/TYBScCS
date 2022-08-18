import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many integers : ");
        int n = in.nextInt();

        Set<Integer> integers = new TreeSet<>();

        System.out.print("Enter integers : ");
        for (int i = 0; i < n; i++)
            integers.add(in.nextInt());

        System.out.println(integers);
    }
}
