import java.awt.*;
import java.awt.event.*;

class ActionListenerExample implements ActionListener {
    String s1, s2, s3, s4, s5;
    int c, n;
    Frame frame = new Frame("Calculator");
    TextField textField = new TextField(20);
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13;
    Panel panel = new Panel();
    GridLayout grid = new GridLayout(3, 2, 10, 20);

    ActionListenerExample() {
        addingButton(button0, "0");
        addingButton(button1, "1");
        addingButton(button2, "2");
        addingButton(button3, "3");
        addingButton(button4, "4");
        addingButton(button5, "5");
        addingButton(button6, "6");
        addingButton(button7, "7");
        addingButton(button8, "8");
        addingButton(button9, "9");
        addingButton(button10, "+");
        addingButton(button11, "-");
        addingButton(button12, "=");
        addingButton(button13, "c");
        panel.setLayout(grid);
        frame.add(panel);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(300, 300);
    }

    public static void main(String[] args) {
        ActionListenerExample actionListenerExample = new ActionListenerExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addNumberToActionPerfomer(button0, "0", e);
        addNumberToActionPerfomer(button1, "1", e);
        addNumberToActionPerfomer(button2, "2", e);
        addNumberToActionPerfomer(button3, "3", e);
        addNumberToActionPerfomer(button4, "4", e);
        addNumberToActionPerfomer(button5, "5", e);
        addNumberToActionPerfomer(button6, "6", e);
        addNumberToActionPerfomer(button7, "7", e);
        addNumberToActionPerfomer(button8, "8", e);
        addNumberToActionPerfomer(button9, "9", e);
        addArithmeticOperations(button10, 1, e);
        addArithmeticOperations(button11, 2, e);

        if (e.getSource() == button12) {
            s2 = textField.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                textField.setText(String.valueOf(n));
            }
            if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                textField.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == button13) {
            textField.setText("");
        }

    }

    void addingButton(Button button, String buttonLabel) {
        button = new Button(buttonLabel);
        button.addActionListener(this);
        panel.add(button);
    }

    void addNumberToActionPerfomer(Button button, String label, ActionEvent e) {
        if (e.getSource() == button) {
            s3 = textField.getText();
            s4 = label;
            s5 = s3 + s4;
            textField.setText(s5);
        }
    }

    void addArithmeticOperations(Button button, int c, ActionEvent e) {
        if (e.getSource() == button) {
            s1 = textField.getText();
            textField.setText("");
            this.c = c;
        }

    }
}
// 2 vesion of calculator