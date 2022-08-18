import java.util.Scanner;

class Ab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = in.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = in.nextInt();

        System.out.println("Area of the reactangle: " + length * breadth + "\nPerimeter of the rectangle: "
                + 2 * (length + breadth));

        in.close();
    }
}