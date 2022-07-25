import java.util.*;

class SenderThread extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Message : ");
        String msg = sc.nextLine();

        RecieverThread rt = new RecieverThread(msg);
        rt.start();
    }
}

class RecieverThread extends Thread {
    String msg;
    static int count = 0;
    SenderThread[] st = new SenderThread[15];

    RecieverThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        if (msg.compareTo("Good Bye Corona") != 0) {
            System.out.println("The Message is " + msg);
            st[count] = new SenderThread();
            st[count].start();
            count++;
        } else
            System.out.println("The Message is " + msg);
    }
}

public class C3 {
    public static void main(String[] args) {
        SenderThread st = new SenderThread();
        st.start();
    }
}