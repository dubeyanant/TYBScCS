import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Aa extends Applet implements ActionListener {
    String msg = " ";
    int v1, v2, result;
    TextField t;
    Button b[] = new Button[10];
    Button add, sub, mul, div, clear, equals;
    char choice;
    Panel p, p1;

    public void init() {
        setLayout(new BorderLayout());
        p = new Panel();
        t = new TextField(20);
        p.add(t);
        p1 = new Panel();
        p1.setLayout(new GridLayout(5, 4));
        // for(int i=0;i<10 i="" span="">
        for (int i = 0; i < 10; i++) {
            b[i] = new Button("" + i);
        }
        equals = new Button("=");
        add = new Button("+");
        sub = new Button("-");

        div = new Button("/");
        clear = new Button("C");
        for (int i = 0; i < 10; i++) {
            p1.add(b[i]);
        }
        p1.add(equals);
        p1.add(add);
        p1.add(sub);
        p1.add(mul);
        p1.add(div);
        p1.add(clear);
        for (int i = 0; i < 10; i++) {
            b[i].addActionListener(this);
        }
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        clear.addActionListener(this);
        equals.addActionListener(this);
        add(p, BorderLayout.NORTH);
        add(p1);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        char ch = str.charAt(0);
        if (Character.isDigit(ch))
            t.setText(t.getText() + str);
        else if (str.equals("+")) {
            v1 = Integer.parseInt(t.getText());
            choice = '+';
            t.setText("");
        } else if (str.equals("-")) {
            v1 = Integer.parseInt(t.getText());
            choice = '-';
            t.setText("");
        } else if (str.equals("*")) {
            v1 = Integer.parseInt(t.getText());
            choice = '*';
            t.setText("");
        } else if (str.equals("/")) {
            v1 = Integer.parseInt(t.getText());
            choice = '/';
            t.setText("");
        }
        if (str.equals("=")) {
            v2 = Integer.parseInt(t.getText());
            if (choice == '+')
                result = v1 + v2;
            else if (choice == '-')
                result = v1 - v2;
            else if (choice == '*')
                result = v1 * v2;
            else if (choice == '/')
                result = v1 / v2;
            t.setText("" + result);
        }
        if (str.equals("C")) {
            t.setText("");
        }
    }
}