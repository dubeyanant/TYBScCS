import java.io.*;
import java.util.*;

class Ab {
    public static void main(String args[]) throws IOException {
        FileReader f = new FileReader("sample.txt");
        Scanner sc = new Scanner(f);
        String CH, CH2;
        while (sc.hasNext()) {
            StringBuilder CH1 = new StringBuilder();
            CH = sc.next();
            CH2 = CH.toUpperCase();
            CH1.append(CH2);
            CH1.reverse();
            System.out.println(CH1);
        }
        f.close();
        sc.close();
    }
}