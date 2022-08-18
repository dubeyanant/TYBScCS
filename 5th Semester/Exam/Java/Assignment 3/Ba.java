import java.util.*;

abstract class Order {
	int id;
	String des;
}

class PurchaseOrder extends Order {
	Scanner in = new Scanner(System.in);
	String customerName;
	
	void accept() {
		System.out.print("\nEnter order id : ");
		id = in.nextInt();
		in.nextLine();
		
		System.out.print("Enter customer name : ");
		customerName = in.nextLine();
		
		System.out.print("Enter description : ");
		des = in.nextLine();
	}
	
	static void display(PurchaseOrder[] obj, int n) {
		System.out.println("\nID\tCustomer name\tDescription");
		
		for(int i = 0; i < n; i++)
			System.out.println(obj[i].id + "\t" + obj[i].customerName + "\t\t" + obj[i].des);
	}
}

class SalesOrder extends Order {
	Scanner in = new Scanner(System.in);
	String vendorName;
	
	void accept() {
		System.out.print("\nEnter order id : ");
		id = in.nextInt();
		in.nextLine();
		
		System.out.print("Enter vendor name : ");
		vendorName = in.nextLine();
		
		System.out.print("Enter description : ");
		des = in.nextLine();
	}
	
	static void display(SalesOrder[] obj, int n) {
		System.out.println("\nID\tVendor name\tDescription");
		
		for(int i = 0; i < n; i++)
			System.out.println(obj[i].id + "\t" + obj[i].vendorName + "\t\t" + obj[i].des);
	}
}

class Main {
	public static void main(String[] args) {
		int n = 3;
		PurchaseOrder[] pOrder = new PurchaseOrder[n];
		SalesOrder[] sOrder = new SalesOrder[n];
		
		for(int i = 0; i < n; i++) {
			pOrder[i] = new PurchaseOrder();
			pOrder[i].accept();
		}
			
		for(int i = 0; i < n; i++) {
			sOrder[i] = new SalesOrder();
			sOrder[i].accept();
		}
			
		PurchaseOrder.display(pOrder, n);
		SalesOrder.display(sOrder, n);
	}
}
