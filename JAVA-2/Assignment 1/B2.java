import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many entries : ");
        int n = in.nextInt();

        Map<String, Integer> entries = new HashMap<>();

        System.out.print("Enter entries : ");
        for (int i = 0; i < n; i++) {
            entries.put(in.next(), in.nextInt());
        }

        TreeMap<String, Integer> sorted = new TreeMap(entries);
        Iterator<String> itr = sorted.keySet().iterator();

        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("Key : " + key + "\tValue : " + sorted.get(key));
        }
    }
}