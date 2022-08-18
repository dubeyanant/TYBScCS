import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Ba extends JFrame implements ActionListener {
        String s;
        JTextField a, b, c, d;
        JRadioButton rb1, rb2, rb3;
        JCheckBox cb1, cb2, cb3, cb4, cb5, cb6;
        JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7;

        public Ba(String s) {
                super(s);
                setLayout(new FlowLayout());
                lb1 = new JLabel("Your Name");
                lb4 = new JLabel("Name");
                lb5 = new JLabel("Class");
                lb6 = new JLabel("Hobbies");
                a = new JTextField(10);
                b = new JTextField(5);
                c = new JTextField(5);
                d = new JTextField(5);

                lb2 = new JLabel("Your class");
                rb1 = new JRadioButton("FY");
                rb2 = new JRadioButton("SY");
                rb3 = new JRadioButton("TY");
                lb3 = new JLabel("Your Hobbies");
                cb1 = new JCheckBox("Music");
                cb2 = new JCheckBox("Dance");
                cb3 = new JCheckBox("Sports");
                lb7 = new JLabel("Style");
                cb4 = new JCheckBox("Bold");
                cb5 = new JCheckBox("Italic");
                cb6 = new JCheckBox("Underline");

                add(lb1);
                add(a);

                setLayout(new GridLayout(9, 2));
                add(lb2);
                add(lb3);
                // add(lb7);
                add(rb1);
                add(cb1);
                // add(cb4);
                add(rb2);
                add(cb2);
                // add(cb5);
                add(rb3);
                add(cb3);
                // add(cb6);
                add(lb4);
                add(b);
                add(lb5);
                add(c);
                add(lb6);
                add(d);
                rb1.addActionListener(this);
                rb2.addActionListener(this);
                rb3.addActionListener(this);
                cb1.addActionListener(this);
                cb2.addActionListener(this);
                cb3.addActionListener(this);

                setSize(300, 200);
                setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
                String msg = "";
                String s1;
                s1 = a.getText();
                b.setText(s1);
                if (ae.getSource() == rb1) {
                        c.setText(msg + "FY");
                }

                if (ae.getSource() == rb2) {
                        c.setText(msg + "SY");
                }

                if (ae.getSource() == rb3) {
                        c.setText(msg + "TY");
                }
                if (ae.getSource() == cb1) {
                        d.setText(msg + "Music");
                }
                if (ae.getSource() == cb2) {
                        d.setText(msg + "Dance");
                }
                if (ae.getSource() == cb3) {
                        d.setText(msg + "Sports");
                }

        }

        public static void main(String args[]) {
                new Ba("Student Information");
        }
}