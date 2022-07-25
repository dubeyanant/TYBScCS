import java.lang.*;

class A2 {
    public static void main(String arr[]) {
        Thread t = Thread.currentThread();
        System.out.print("Current thread is : " + t);
        t.setName("Changed thread");
        System.out.println("After name change : " + t);
        try {
            for (int n = 100; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted!");
        }
    }
}