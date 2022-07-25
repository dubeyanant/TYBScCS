import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many colors : ");
        int n = in.nextInt();

        System.out.print("Enter color names : ");
        Set<String> colors = new TreeSet<>();

        for (int i = 0; i < n; i++)
            colors.add(in.next());

        System.out.println(colors);
    }
}
