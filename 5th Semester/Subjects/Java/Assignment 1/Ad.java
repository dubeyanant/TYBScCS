import java.util.Scanner;
import java.util.Arrays;

public class Ad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array is: " + Arrays.toString(arr));

        in.close();
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
