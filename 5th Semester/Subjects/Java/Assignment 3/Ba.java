import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Order {
    String id, description;
}

class PurchaseOrder extends Order {
    String Customername, Vendorname;

    public void accept() throws IOException {
        System.out.println("Enter the id,description,names of customers and vendors: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        id = br.readLine();
        description = br.readLine();
        Customername = br.readLine();
        Vendorname = br.readLine();
        System.out.println("");
    }

    public void display() {
        System.out.println(" Object is created \nid: " + id + "\nDescription: " + description + "\nCustomername: "
                + Customername + "\nVendorname: " + Vendorname + "\n----------------------");
    }
}

class SalesOrder extends Order {
    String Customername, Vendorname;

    public void accept() throws IOException {
        System.out.println("Enter the id,description,names of customers and vendors: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        id = br.readLine();
        description = br.readLine();
        Customername = br.readLine();
        Vendorname = br.readLine();
        System.out.println("");
    }

    public void display() {
        System.out.println(" Object is created \nid: " + id + "\nDescription: " + description + "\nCustomername: "
                + Customername + "\nVendorname: " + Vendorname + "\n----------------------");
    }
}

public class Ba {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i;
        System.out.println("Select Any One: \n1.Purchase Order\n2.Sales Order");
        int ch = Integer.parseInt(br.readLine());

        switch (ch) {
            case 1:
                System.out.println("Enter the number of purchase Orders: ");
                int n = Integer.parseInt(br.readLine());
                PurchaseOrder[] l = new PurchaseOrder[n];
                for (i = 0; i < n; i++) {
                    l[i] = new PurchaseOrder();
                    l[i].accept();
                }
                for (i = 0; i < n; i++)
                    l[i].display();
                break;

            case 2:
                System.out.println("Enter the number of sales orders: ");
                int m = Integer.parseInt(br.readLine());
                SalesOrder[] h = new SalesOrder[m];
                for (i = 0; i < m; i++) {
                    h[i] = new SalesOrder();
                    h[i].accept();
                }
                for (i = 0; i < m; i++)
                    h[i].display();
                break;

        }
    }
}