import java.util.Arrays;
import java.util.Scanner;

public class Bc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a[][] = { { 5, 6, 7 }, { 8, 9, 10 }, { 3, 1, 2 } };
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int c[][] = new int[3][3];

        System.out.println("A = " + Arrays.deepToString(a));
        System.out.println("B = " + Arrays.deepToString(b));

        int choice;

        do {
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    c = add(a, b);
                    System.out.println("Sum of matrix: ");
                    System.out.println(Arrays.deepToString(c));
                    break;
                case 2:
                    c = multiply(a, b);
                    System.out.println("Multiplication of matrix: ");
                    System.out.println(Arrays.deepToString(c));
                    break;
                case 3:
                    System.out.println("Transpose of the first matrix: ");
                    c = transpose(a);
                    System.out.println(Arrays.deepToString(c));
                    System.out.println("Transpose of the second matrix: ");
                    c = transpose(b);
                    System.out.println(Arrays.deepToString(c));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid input.");
                    System.out.println("Please enter the correct input.");
            }
        } while (true);
    }

    public static int[][] add(int[][] a, int[][] b) {

        int row = a.length;
        int column = a[0].length;

        int sum[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum;
    }

    public static int[][] multiply(int[][] a, int[][] b) {

        int row = a.length;
        int column = b[0].length;

        int product[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                product[i][j] = 0;

                for (int k = 0; k < a[0].length; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    public static int[][] transpose(int[][] a) {

        int row = a.length;
        int column = a[0].length;

        int temp[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                temp[i][j] = a[j][i];
            }
        }

        return temp;
    }
}