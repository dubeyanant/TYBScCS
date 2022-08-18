import java.util.Arrays;

public class Ac {
    public static void main(String[] args) {

        System.out.println("Entered array : " + Arrays.toString(args));
        Arrays.sort(args);
        System.out.println("Sorted array : " + Arrays.toString(args));
    }
}
