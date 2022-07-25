import java.util.LinkedList;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        boolean flag = true;

        while (flag) {
            System.out.print(
                    "1. Add element at first position\n2. Delete last element\n3. Display size\n4. Exit\nEnter choice : ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element : ");
                    list.addFirst(in.nextInt());
                    System.out.println("Element added!");
                    break;

                case 2:
                    list.removeLast();
                    System.out.println("Last element deleted!");
                    break;

                case 3:
                    System.out.println("Size of the linked list : " + list.size());
                    break;

                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("Wrong option! Try again.");
            }
        }
    }
}