


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    JTextField display;
    double num1, num2, result;
    String operator = "";

    public Calculator() {

        setTitle("My Java Calculator");
        setSize(350, 450);  
        
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setEditable(false);

        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {

            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 22));

            button.addActionListener(e -> {
                String value = e.getActionCommand();

                if (value.matches("[0-9]")) {
                    display.setText(display.getText() + value);
                }
                else if (value.equals("C")) {
                    display.setText("");
                    num1 = 0;
                    num2 = 0;
                    operator = "";
                }
                else if (value.matches("[+\\-*/]")) {
                    num1 = Double.parseDouble(display.getText());
                    operator = value;
                    display.setText("");
                }
                else if (value.equals("=")) {

                    if (display.getText().isEmpty() || operator.isEmpty()) {
                        return;
                    }

                    num2 = Double.parseDouble(display.getText());

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                display.setText("Cannot divide by zero");
                                operator = "";
                                return;
                            }
                            result = num1 / num2;
                            break;
                    }

                    display.setText(String.valueOf(result));
                    operator = "";
                }
            });

            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}