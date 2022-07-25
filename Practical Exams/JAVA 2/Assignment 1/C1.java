import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class C1_re extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b1, b2, b3;
    JTextArea t;
    JPanel p1, p2;

    Hashtable ts;

    C1_re() {
        ts = new Hashtable();
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton("Add");
        b2 = new JButton("Search");
        b3 = new JButton("Remove");

        t = new JTextArea(15, 30);
        p1 = new JPanel();
        p1.add(t);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 3));
        p2.add(t1);
        p2.add(t2);
        p2.add(b1);
        p2.add(t3);
        p2.add(b2);
        p2.add(b3);

        add(p1);
        add(p2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(330, 355);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (b1 == e.getSource()) {
            String name = t1.getText();
            int code = Integer.parseInt(t2.getText());
            ts.put(name, code);
            Enumeration k = ts.keys();
            Enumeration v = ts.elements();
            String msg = "";
            while (k.hasMoreElements()) {
                msg = msg + k.nextElement() + " = " + v.nextElement() + "\n";
            }
            t.setText(msg);
            t1.setText("");
            t2.setText("");

        } else if (b2 == e.getSource()) {
            String name = t3.getText();

            if (ts.containsKey(name)) {
                t.setText(ts.get(name).toString());
            } else
                JOptionPane.showMessageDialog(null, "City not found...");

        } else if (b3 == e.getSource()) {
            String name = t3.getText();

            if (ts.containsKey(name)) {
                ts.remove(name);
                JOptionPane.showMessageDialog(null, "City Deleted...");
            } else
                JOptionPane.showMessageDialog(null, "City not found...");
        }
    }

    public static void main(String a[]) {
        new C1_re();
    }
}