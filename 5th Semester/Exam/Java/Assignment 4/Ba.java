import java.io.*;
import java.util.*;

class Item {
    String name, id;
    int qty;
    double price, total;

    Item(String id, String name, String price, String qty) {
        this.name = name;
        this.id = id;
        this.qty = Integer.parseInt(qty);
        this.price = Double.parseDouble(price);
        this.total = this.qty * this.price;
    }

    static void search(Item[] obj, int n) {
        Scanner in = new Scanner(System.in);
		String str = in.nextLine();

        for (int i = 0; i < n; i++)
            if (obj[i].name.equals(str)) {
				System.out.println("ID : " + obj[i].id + "\nName : " + obj[i].name + "\nQuantity : " + obj[i].qty + "\nPrice : " + obj[i].price + "\nTotal : " + obj[i].total);
                return;
            }

        System.out.println("No Records Found");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

		int choice, n = 0, size = 20;
        Item it[] = new Item[size];

        RandomAccessFile fr = new RandomAccessFile("book.dat", "rw");
        
        while(fr.getFilePointer() < fr.length()) {
            StringTokenizer t = new StringTokenizer(fr.readLine(), ",");
            
            String id = new String(t.nextToken());
            String name = new String(t.nextToken());
            String price = new String(t.nextToken());
            String qty = new String(t.nextToken());
            
            System.out.println(id + " " + name + " " + price + " " + qty);
            
            it[n++] = new Item(id, name, price, qty);
        }

        do {

            System.out
                    .print("\n1:Search for a book by name\n2:Display all items and total cost\n3:Exit\nEnter choice : ");
            choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter item name to be searched : ");
                    Item.search(it, n);
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Book name\tTotal Price");
                    for (int i = 0; i < n; i++)
                        System.out.println(it[i].name + "\t" + it[i].total);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 3);

        fr.close();
    }
}
