import java.io.*;
import java.util.StringTokenizer;

class item {
    String name, id;
    int qty;
    double price, total;

    // this is used to store data in the objects
    item(String id, String name, String qty, String price) {
        this.name = name;
        this.id = id;
        this.qty = Integer.parseInt(qty);
        this.price = Double.parseDouble(price);
        this.total = this.qty * this.price;
    }

    // this is used to search book names in all the objects
    public static void search(item[] arr, int n) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (int i = 0; i < n; i++)
            if (arr[i].name.equals(s)) {
                System.out.println(arr[i].toStr());
                return;
            }

        System.out.println("No Records Found");
    }

    // this is used to convert objects into string
    public String toStr() {

        String s = name + " " + id + " " + qty + " " + price + " " + total;
        return s;

    }
}

public class Ba {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        item it[] = new item[20];
        int choice;
        int n = 0;

        try {
            File file = new File("book.dat"); // creates a new file instance
            FileReader fr = new FileReader(file); // reads the file
            BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // printing what line variable currently have
                StringTokenizer t = new StringTokenizer(line, " "); // tokenizing line into t
                String id = new String(t.nextToken()); // storing parts of t
                String name = new String(t.nextToken());
                String price = new String(t.nextToken());
                String qty = new String(t.nextToken());
                it[n++] = new item(id, name, price, qty); // n++ stores number of lines in the file
            }

            do {

                System.out
                        .print("\n1:Search for a book by name\n2:Display all items and total cost\n3:Exit\nChoice : ");
                choice = Integer.parseInt(b.readLine());

                switch (choice) {

                    case 1:
                        System.out.print("\nEnter item name to be searched : ");
                        item.search(it, n);
                        break;

                    case 2:
                        System.out.println("");
                        for (int i = 0; i < n; i++)
                            System.out.println(it[i].toStr());
                        break;

                    case 3:
                        break;

                    default:
                        System.out.println("Invalid Option");
                }
            } while (choice != 3);

            fr.close(); // closes the stream and release the resources
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}