import java.util.Scanner;
import java.util.Arrays;

public class Ca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of countries to enter: ");
        int n = in.nextInt();

        String[] names = new String[n];
        System.out.print("Enter names of the country: ");
        for (int i = 0; i < n; i++) {
            names[i] = in.next();
        }

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) < 0) { // .compareTo method compares two strings in lexicographical
                                                        // order
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }

        System.out.println(Arrays.toString(names));

        in.close();
    }
}