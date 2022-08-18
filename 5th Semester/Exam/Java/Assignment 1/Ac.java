package com.anant.ass1;

import java.util.Scanner;

public class Ac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.print("\n1. Calculate the volume of cylinder\n2. Find the factorial of given number\n3. Check the number is Armstrong or not\n4. Exit");
            System.out.print("\nEnter choice : ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter radius and height of the cylinder : ");
                    int radius = in.nextInt();
                    int height = in.nextInt();
                    System.out.println("Volume of the cylinder : " + (3.14 * radius * radius * height));
                    break;

                case 2:
                    System.out.print("\nEnter a number : ");
                    int num1 = in.nextInt();
                    int fact = 1;
                    for (int i = num1; i > 0; i--)
                        fact *= i;
                    System.out.println("Factorial of " + num1 + " is " + fact);
                    break;

                case 3:
                    System.out.print("\nEnter a number : ");
                    int num2 = in.nextInt();
                    int last, armstrong = 0, temp = num2;
                    while (temp != 0) {
                        last = temp % 10;
                        temp /= 10;
                        armstrong += last * last * last;
                    }
                    if (armstrong == num2) System.out.println(num2 + " is an armstrong number!");
                    else System.out.println(num2 + " is not an armstrong number!");
                    break;

                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("Unrecognized choice!\n");
            }
        }
    }
}
