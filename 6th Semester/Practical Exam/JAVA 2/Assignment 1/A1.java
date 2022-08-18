import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many cities : ");
        int n = in.nextInt();

        ArrayList<String> cities = new ArrayList<>();

        System.out.print("Enter city names : ");
        for (int i = 0; i < n; i++) {
            cities.add(in.next());
        }

        Iterator it = cities.iterator();
        System.out.print("Cities are : ");
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        cities.clear();
        System.out.println("After clearing arraylist : " + cities);
    }
}
