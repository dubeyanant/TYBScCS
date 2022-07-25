import java.io.*;

public class B2 extends Thread {
    File f1;
    String fname;
    static String str;
    String line;
    LineNumberReader reader = null;

    int flag = 0;

    B2(String fname) {
        this.fname = fname;
        f1 = new File(fname);
    }

    public void run() {
        try {
            FileReader fr = new FileReader(f1);
            reader = new LineNumberReader(fr);
            while ((line = reader.readLine()) != null) {
                if (line.indexOf(str) != -1) {
                    System.out.println(
                            "String \"" + str + "\" found in " + fname + " at line no. " + reader.getLineNumber());
                    flag = 1;
                    stop();
                }
            }

            if (flag == 0) {
                System.out.println("String \"" + str + "\" not found in " + fname + " file!");
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws IOException {
        Thread t[] = new Thread[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string to search : ");
        str = br.readLine();

        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File file, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        File dir1 = new File(".");
        File[] files = dir1.listFiles(filter);
        if (files.length == 0) {
            System.out.println("No files available with this extension");
        } else {
            for (int i = 0; i < files.length; i++) {
                for (File aFile : files) {
                    t[i] = new B2(aFile.getName());
                    t[i].start();
                }
            }
        }
    }
}