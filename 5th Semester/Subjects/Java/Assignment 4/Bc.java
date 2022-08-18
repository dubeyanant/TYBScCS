import java.io.*;

class InvalidDateException extends Exception {
}

class MyDate {
    int day, mon, yr;

    void accept(int d, int m, int y) {
        day = d;
        mon = m;
        yr = y;
    }

    void display() {
        System.out.println("Date is valid : " + day + "/" + mon + "/" + yr);
    }
}

class Bc {
    public static void main(String arg[]) throws Exception {
        System.out.println("Enter Date  :  dd mm yyyy ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(br.readLine());
        int mon = Integer.parseInt(br.readLine());
        int yr = Integer.parseInt(br.readLine());
        int flag = 0;
        try {
            if (mon <= 0 || mon > 12)

                throw new InvalidDateException();
            else {
                if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
                    if (day >= 1 && day <= 31)
                        flag = 1;
                    else
                        throw new InvalidDateException();
                } else if (mon == 2) {
                    if (yr % 4 == 0) {
                        if (day >= 1 && day <= 29)
                            flag = 1;
                        else
                            throw new InvalidDateException();
                    } else {
                        if (day >= 1 && day <= 28)
                            flag = 1;
                        else
                            throw new InvalidDateException();
                    }
                } else {
                    if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                        if (day >= 1 && day <= 30)
                            flag = 1;
                        else
                            throw new InvalidDateException();
                    }
                }
            }
            if (flag == 1) {
                MyDate dt = new MyDate();
                dt.accept(day, mon, yr);
                dt.display();
            }
        } catch (InvalidDateException mm) {
            System.out.println("Invalid Date");
        }

    }
}