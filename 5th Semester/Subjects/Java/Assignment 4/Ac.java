import java.io.*;
import java.util.*;

class Ac {
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("source file name : ");
        String file1 = sc.next();
        System.out.print("destination file name : ");
        String file2 = sc.next();
        sc.close(); // closing the scanner stream
        FileReader fin = new FileReader(file1);
        FileWriter fout = new FileWriter(file2, true);
        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        fout.append("\nEnd of File!");
        System.out.println("Copy finish...");

        fin.close();
        fout.close();
    }
}