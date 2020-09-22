import java.awt.*;
import java.awt.event.*;

class calculator implements ActionListener {
    int c, n;
    String s1, s2, s3, s4, s5;
    Frame frame;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
    Panel panel;
    TextField tf;
    GridLayout g;

    calculator() {
        frame = new Frame("My calculator");
        panel = new Panel();
        frame.setLayout(new FlowLayout());
        b1 = new Button("0");
        b1.addActionListener(this);
        b2 = new Button("1");
        b2.addActionListener(this);
        b3 = new Button("2");
        b3.addActionListener(this);
        b4 = new Button("3");
        b4.addActionListener(this);
        b5 = new Button("4");
        b5.addActionListener(this);
        b6 = new Button("5");
        b6.addActionListener(this);
        b7 = new Button("6");
        b7.addActionListener(this);
        b8 = new Button("7");
        b8.addActionListener(this);
        b9 = new Button("8");
        b9.addActionListener(this);
        b10 = new Button("9");
        b10.addActionListener(this);
        b11 = new Button("+");
        b11.addActionListener(this);
        b12 = new Button("-");
        b12.addActionListener(this);
        b13 = new Button("*");
        b13.addActionListener(this);
        b14 = new Button("/");
        b14.addActionListener(this);
        b15 = new Button("%");
        b15.addActionListener(this);
        b16 = new Button("=");
        b16.addActionListener(this);
        b17 = new Button("C");
        b17.addActionListener(this);
        tf = new TextField(20);
        frame.add(tf);
        g = new GridLayout(4, 4, 10, 20);
        panel.setLayout(g);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        panel.add(b17);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b2) {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b3) {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b4) {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b5) {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b6) {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b7) {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b8) {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b9) {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b10) {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b11) {
            s1 = tf.getText();
            tf.setText("");
            c = 1;

        }
        if (e.getSource() == b12) {
            s1 = tf.getText();
            tf.setText("");
            c = 2;

        }
        if (e.getSource() == b13) {
            s1 = tf.getText();
            tf.setText("");
            c = 3;

        }
        if (e.getSource() == b14) {
            s1 = tf.getText();
            tf.setText("");
            c = 4;

        }
        if (e.getSource() == b15) {
            s1 = tf.getText();
            tf.setText("");
            c = 5;

        }
        if (e.getSource() == b16) {
            s2 = tf.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            } else if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            } else if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }else if (c == 4) {
                try {
                    int p = Integer.parseInt(s2);
                    if (p != 0) {
                        n = Integer.parseInt(s1) / Integer.parseInt(s2);
                        tf.setText(String.valueOf(n));
                    } else
                        tf.setText("infinite");

                } catch (Exception i) {
                }
            }else if (c == 5) {
                n = Integer.parseInt(s1) % Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == b17) {
            tf.setText("");
        }
    }

    public static void main(String[] abc) {
        Calculator calculator = new Calculator();
    }
}