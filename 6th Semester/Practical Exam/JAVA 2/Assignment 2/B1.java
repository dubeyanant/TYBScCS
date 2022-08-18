import java.util.*;

class thread implements Runnable {
    Thread t;
    int i, no, sum;
    int a[] = new int[1000];

    thread(String s, int n) {
        Random rs = new Random();
        t = new Thread(this, s);
        no = n;
        int j = 0;
        for (i = 1; i <= 1000; i++) {
            a[j] = rs.nextInt() % 100;
            j++;
        }
        t.start();
    }

    public void run() {
        for (i = 0; i < 100; i++) {
            sum = sum + a[no];
            no++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Avg =" + sum / 100);
    }
}

public class B1 {
    public static void main(String[] arg) throws InterruptedException {
        thread t1 = new thread("g", 1);
        t1.t.join();
        thread t2 = new thread("r", 100);
        t2.t.join();
        thread t3 = new thread("s", 200);
        t3.t.join();
        thread t4 = new thread("t", 300);
        t4.t.join();
        thread t5 = new thread("p", 400);
        t5.t.join();
        thread t6 = new thread("a", 500);
        t5.t.join();
        thread t7 = new thread("b", 600);
        t5.t.join();
        thread t8 = new thread("c", 700);
        t5.t.join();
        thread t9 = new thread("d", 800);
        t5.t.join();
        thread t10 = new thread("e", 900);
        t5.t.join();
    }
}