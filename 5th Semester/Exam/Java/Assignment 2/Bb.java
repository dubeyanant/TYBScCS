import java.util.*;

class CricketPlayer {
	String name;
	int tInn, tn, tr;
	double avg;
	
	CricketPlayer(String name, int tInn, int tn, int tr) {
		this.name = name;
		this.tInn = tInn;
		this.tn = tn;
		this.tr = tr;
		this.avg = average(tr, tInn);
	}
	
	static double average(int tr, int tInn) {
		return (double)tr / tInn;
	}
	
	static void sort(CricketPlayer[] obj, int n) {
		for(int i = 0; i < n; i++)
			for(int j = i+1; j < n; j++)
				if(obj[j].avg < obj[i].avg) {
					CricketPlayer temp = obj[j];
					obj[j] = obj[i];
					obj[i] = temp;
				} 
	}
	
	static void display(CricketPlayer[] obj, int n) {
		System.out.println("\nName\t\tTnI\tTnN\tTnR\tAvg");
		for(int i = 0; i < n; i++)
			System.out.println(obj[i].name + "\t" + obj[i].tInn + "\t" + obj[i].tn + "\t" + obj[i].tr + "\t" + obj[i].avg);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Total no of players : ");
		int n = in.nextInt();
		in.nextLine();
		
		CricketPlayer[] obj = new CricketPlayer[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("\nEnter player name : ");
			String name = in.nextLine();
			
			System.out.print("Enter total no of innings : ");
			int tInn = in.nextInt();
			
			System.out.print("Enter total no of not-outs : ");
			int tn = in.nextInt();
			
			System.out.print("Enter total no of runs : ");
			int tr = in.nextInt();
			in.nextLine();
			
			obj[i] = new CricketPlayer(name, tInn, tn, tr);
		}
		
		sort(obj, n);
		display(obj, n);
	}
}
