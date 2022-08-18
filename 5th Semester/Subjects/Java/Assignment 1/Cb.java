import java.util.Scanner;

public class Cb {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row, col, i, j, sum = 0, upper_sum = 0, lower_sum = 0;
        boolean flag = true;

        System.out.print("Enter the number of rows : ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.print("Enter the elements of the matrix : ");
        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("The elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println("");
        }

        while (flag) {

            System.out.print(
                    "\n\n1. Sum of diagonal elements\n2. Sum of upper diagonal elements\n3. Sum of lower diagonal elements\n4. Exit\nEnter an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (i = 0; i < row; i++)
                        for (j = 0; j < col; j++)
                            if (i == j)
                                sum = sum + mat[i][j];

                    System.out.printf("\nSum of diagonal elements : " + sum);
                    break;

                case 2:
                    for (i = 0; i < row; i++)
                        for (j = 0; j < col; j++)
                            if (i < j)
                                upper_sum += mat[i][j];

                    System.out.println("\nSum of upper diagonal elements : " + upper_sum);
                    break;

                case 3:
                    for (i = 0; i < row; i++)
                        for (j = 0; j < col; j++)
                            if (j < i)
                                lower_sum += mat[i][j];

                    System.out.print("\nSum of lower diagonal elements : " + lower_sum);
                    break;

                case 4:
                    flag = false;
                    break;
            }
        }

    }
}