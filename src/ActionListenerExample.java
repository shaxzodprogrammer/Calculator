import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    String s1, s2, s3, s4, s5;
    int c, n;
    Frame frame = new Frame("Calculator");
    TextField textField = new TextField(20);
    Button button0 = new Button("0");
    Button button1 = new Button("1");
    Button button2 = new Button("2");
    Button button3 = new Button("3");
    Button button4 = new Button("4");
    Button button5 = new Button("5");
    Button button6 = new Button("6");
    Button button7 = new Button("7");
    Button button8 = new Button("8");
    Button button9 = new Button("9");
    Button button10 = new Button("+");
    Button button11 = new Button("-");
    Button button12 = new Button("=");
    Button button13 = new Button("c");
    Panel panel = new Panel();
    GridLayout grid = new GridLayout(3, 2, 10, 20);

    Calculator() {
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        frame.add(textField);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.setLayout(grid);
        frame.add(panel);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(300, 300);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            s3 = textField.getText();
            s4 = "0";
            s5 = s3 + s4;
            textField.setText(s5);
        }


        if (e.getSource() == button1) {
            s3 = textField.getText();
            s4 = "1";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button2) {
            s3 = textField.getText();
            s4 = "2";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button3) {
            s3 = textField.getText();
            s4 = "3";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button4) {
            s3 = textField.getText();
            s4 = "4";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button5) {
            s3 = textField.getText();
            s4 = "5";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button6) {
            s3 = textField.getText();
            s4 = "6";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button7) {
            s3 = textField.getText();
            s4 = "7";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button8) {
            s3 = textField.getText();
            s4 = "8";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button9) {
            s3 = textField.getText();
            s4 = "9";
            s5 = s3 + s4;
            textField.setText(s5);
        }
        if (e.getSource() == button10) {
            s1 = textField.getText();
            textField.setText("");
            c = 1;
        }

        if (e.getSource() == button11) {
            s1 = textField.getText();
            textField.setText("");
            c = 2;
        }

        if (e.getSource() == button12){
            s2 = textField.getText();
            if(c == 1){
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                textField.setText(String.valueOf(n));
            }
            if(c == 2){
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                textField.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == button13){
            textField.setText("");
        }

    }
}
