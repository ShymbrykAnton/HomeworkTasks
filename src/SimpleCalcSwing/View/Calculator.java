package SimpleCalcSwing.View;


import SimpleCalcSwing.Blogic.Math.Calculations;
import SimpleCalcSwing.ButtonListeners.ButtonClickListener;

import javax.swing.*;
import java.awt.event.ActionListener;


public class Calculator {

    public Calculator() {
//TODO переделать хелп информейшн
        JFrame frame = new JFrame("Калькулятор");
        JLabel helpInformation = new JLabel("  Данный калькулятор умеет выполнять следующие операции: ");
        JLabel helpInformation1 = new JLabel("суммирование  -  \"+\", вычитание  -  \"-\", умножение  -  \"*\",");
        JLabel helpInformation2 = new JLabel("деление - \"/\", вычисление корня число 2-степени - \"root\",");
        JLabel helpInformation3 = new JLabel("возведение числа в число 2-степень - \"-pow\".");
        helpInformation.setBounds(10, 20, 380, 40);
        helpInformation1.setBounds(10, 40, 380, 40);
        helpInformation2.setBounds(10, 60, 380, 40);
        helpInformation3.setBounds(10, 80, 380, 40);

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


        frame.add(helpInformation);
        frame.add(helpInformation1);
        frame.add(helpInformation2);
        frame.add(helpInformation3);
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

