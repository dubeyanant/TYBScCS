package com.anant.ass1;

import java.util.Scanner;

public class Ab {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length and breadth of the rectangle : ");
        int length = in.nextInt();
        int breadth = in.nextInt();

        System.out.println("Area of the rectangle is : " + (length * breadth) + "\nPerimeter of the rectangle is : " + (2 * (length + breadth)));
    }
}