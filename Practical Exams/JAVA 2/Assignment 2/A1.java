class demo extends Thread {
    String msg = "";
    int n;

    demo(String msg, int n) {
        this.msg = msg;
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println(msg + " " + i + " times");
            }
            System.out.println("\n ");
        } catch (Exception e) {
        }
    }
}

class A1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // pass 10 as command line argument
        // int n = 10;
        demo t1 = new demo("COVID19", n);
        t1.start();
        demo t2 = new demo("LOCKDOWN2020", n + 10);
        t2.start();
        demo t3 = new demo("VACCINATED2021", n + 20);
        t3.start();
    }
}