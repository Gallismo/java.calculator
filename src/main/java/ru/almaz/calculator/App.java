package ru.almaz.calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    public int res = 0;
    private JPanel panel;
    private JButton plus, minus, multiply, divide;
    private JLabel result;
    private JTextField x1, x2;
    private ActionListener listenerPlus, listenerMinus, listenerMultiply, listenerDivide;

    public App() {
        setTitle("Calculator");
        addObjects();
        addButtonListeners();
        panelAdd();

        setPreferredSize(new Dimension(600, 600));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    private void addObjects() {
        panel = new JPanel();
        plus = new JButton("+");
        plus.setPreferredSize(new Dimension(50, 50));
        minus = new JButton("-");
        minus.setPreferredSize(new Dimension(50, 50));
        multiply = new JButton("*");
        multiply.setPreferredSize(new Dimension(50, 50));
        divide = new JButton("/");
        divide.setPreferredSize(new Dimension(50, 50));
        result = new JLabel("result");
        result.setPreferredSize(new Dimension(50, 50));
        x1 = new JTextField("1");
        x1.setPreferredSize(new Dimension(50, 50));
        x1.setHorizontalAlignment(SwingConstants.CENTER);
        x2 = new JTextField("2");
        x2.setPreferredSize(new Dimension(50, 50));
        x2.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void addButtonListeners() {
        listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 + x_2;
                result.setText(String.valueOf(res));
            }
        };
        listenerMinus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 - x_2;
                result.setText(String.valueOf(res));
            }
        };
        listenerMultiply = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 * x_2;
                result.setText(String.valueOf(res));
            }
        };
        listenerDivide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 / x_2;
                result.setText(String.valueOf(res));
            }
        };

        plus.addActionListener(listenerPlus);
        minus.addActionListener(listenerMinus);
        multiply.addActionListener(listenerMultiply);
        divide.addActionListener(listenerDivide);
    }

    private void panelAdd() {
        panel.setSize(new Dimension(500, 500));
        add(panel);

        panel.add(result);
        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);
        panel.add(x1);
        panel.add(x2);
    }
}
