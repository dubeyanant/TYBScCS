import java.util.*;

public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many friends : ");
        int n = in.nextInt();

        LinkedList<String> cities = new LinkedList<>();

        System.out.print("Enter friends name : ");
        for (int i = 0; i < n; i++)
            cities.add(in.next());

        System.out.println(cities);
    }
}
