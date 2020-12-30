package SimpleCalcSwing.View;


import SimpleCalcSwing.Blogic.Math.Calculations;
import SimpleCalcSwing.ButtonListeners.ButtonClickListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator {
    //TODO разобраться с native Math.pow

    public Calculator() {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(40,120,40));
        JTextArea helpTextArea = new JTextArea();
        helpTextArea.setBounds(10,20,360,80);
        helpTextArea.setText("  Данный калькулятор умеет выполнять следующие операции: " +
                "\n суммирование   -  \"+\", вычитание   -  \"-\", умножение  -  \"*\"," +
                "\n деление - \"/\", вычисление корня число 2-степени - \"root\"," +
                "\n возведение числа в число 2-степень - \"pow\".");

        JLabel labelNumber1 = new JLabel("Число 1");
        JTextField textFieldNumber1 = new JTextField();
        labelNumber1.setBounds(45, 120, 100, 40);
        textFieldNumber1.setBounds(150, 120, 190, 40);
        JLabel labelNumber2 = new JLabel("Число 2");
        JTextField textFieldNumber2 = new JTextField();
        labelNumber2.setBounds(45, 170, 100, 40);
        textFieldNumber2.setBounds(150, 170, 190, 40);
        JLabel labelOperation = new JLabel("Операция");
        JTextField textFieldOperation = new JTextField();
        labelOperation.setBounds(45, 220, 100, 40);
        textFieldOperation.setBounds(150, 220, 190, 40);

        JButton button = new JButton("Посчитать");
        button.setBounds(45, 270, 295, 50);

        JLabel labelResult = new JLabel("Результат");
        JTextArea textAreaResult = new JTextArea();
        labelResult.setBounds(45, 330, 100, 40);
        textAreaResult.setBounds(150, 330, 190, 40);

        frame.add(helpTextArea);
        frame.add(labelNumber1);
        frame.add(textFieldNumber1);
        frame.add(labelNumber2);
        frame.add(textFieldNumber2);
        frame.add(labelOperation);
        frame.add(textFieldOperation);
        frame.add(button);
        frame.add(labelResult);
        frame.add(textAreaResult);
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setVisible(true);

        ActionListener listener = new ButtonClickListener(textFieldNumber1, textFieldNumber2, textFieldOperation,
                textAreaResult, new Calculations());
        button.addActionListener(listener);

    }
}

