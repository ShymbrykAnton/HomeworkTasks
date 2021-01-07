package ConverterSwing.View;

import ConverterSwing.ButtonLesteners.HelpButtonClickListener;
import ConverterSwing.ButtonLesteners.MainButtonClickListener;
import ConverterSwing.blogic.IConverter;
import ConverterSwing.blogic.LengthConverter.FromAndToMeters;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Converter {
    IConverter converter;
    public Converter() {
        JFrame converterMainWindow = new JFrame("Конвертер");
        converterMainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        converterMainWindow.getContentPane().setBackground(new Color(0, 241, 0, 131));

        JButton helpButton = new JButton("?");
        helpButton.setBounds(5, 5, 50, 35);

        JLabel labelCategory = new JLabel("Категория конвертируемых величин:");
        JTextField textFieldCategory = new JTextField();
        labelCategory.setBounds(15, 30, 250, 40);
        textFieldCategory.setBounds(250, 30, 100, 40);

        JLabel labelConvertFrom = new JLabel("Из:");
        JTextField textFieldConvertFrom = new JTextField();
        labelConvertFrom.setBounds(45, 90, 50, 40);
        textFieldConvertFrom.setBounds(80, 90, 100, 40);

        JLabel labelConvertTo = new JLabel("В:");
        JTextField textFieldConvertTo = new JTextField();
        labelConvertTo.setBounds(200, 90, 50, 40);
        textFieldConvertTo.setBounds(225, 90, 100, 40);

        JLabel labelValue = new JLabel("Количество:");
        JTextField textFieldValue = new JTextField();
        labelValue.setBounds(45, 140, 100, 40);
        textFieldValue.setBounds(145, 140, 120, 40);

        JButton mainButton = new JButton("Ковертировать");
        mainButton.setBounds(45, 200, 295, 50);

        JLabel labelResult = new JLabel("Результат:");
        JTextArea textAreaResult = new JTextArea();
        labelResult.setBounds(45, 270, 100, 40);
        textAreaResult.setBounds(120, 270, 250, 40);

        converterMainWindow.add(helpButton);
        converterMainWindow.add(labelCategory);
        converterMainWindow.add(textFieldCategory);
        converterMainWindow.add(labelConvertFrom);
        converterMainWindow.add(textFieldConvertFrom);
        converterMainWindow.add(labelValue);
        converterMainWindow.add(textFieldValue);
        converterMainWindow.add(labelConvertTo);
        converterMainWindow.add(textFieldConvertTo);
        converterMainWindow.add(mainButton);
        converterMainWindow.add(labelResult);
        converterMainWindow.add(textAreaResult);
        converterMainWindow.setSize(400, 400);
        converterMainWindow.setLayout(null);
        converterMainWindow.setVisible(true);

        ActionListener listenerMain = new MainButtonClickListener(textFieldCategory, textFieldConvertFrom, textFieldConvertTo,
                textFieldValue, textAreaResult);
        ActionListener listenerHelp = new HelpButtonClickListener();
        mainButton.addActionListener(listenerMain);
        helpButton.addActionListener(listenerHelp);

    }
}
