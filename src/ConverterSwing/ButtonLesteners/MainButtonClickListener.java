package ConverterSwing.ButtonLesteners;

import ConverterSwing.CategoryFactory;
import ConverterSwing.View.Converter;
import ConverterSwing.blogic.IConverter;
import ConverterSwing.blogic.LengthConverter.FromAndToMeters;
import SimpleCalcSwing.Blogic.Math.Calculations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainButtonClickListener implements ActionListener {
    private final CategoryFactory factory = new CategoryFactory();
    private final JTextField textFieldCategory;
    private final JTextField textFieldConvertFrom;
    private final JTextField textFieldConvertTo;
    private final JTextField textFieldValue;
    private final JTextArea textAreaResult;
    IConverter iConverter;

    public MainButtonClickListener(JTextField textFieldCategory, JTextField textFieldConvertFrom,
                                   JTextField textFieldConvertTo, JTextField textFieldValue,
                                   JTextArea textAreaResult) {
        this.textFieldCategory = textFieldCategory;
        this.textFieldConvertFrom = textFieldConvertFrom;
        this.textFieldConvertTo = textFieldConvertTo;
        this.textFieldValue = textFieldValue;
        this.textAreaResult = textAreaResult;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String category = textFieldCategory.getText();
        iConverter = factory.getInstanceByCategory(category);
        String convertFrom = textFieldConvertFrom.getText();
        String convertTo = textFieldConvertTo.getText();
        double value = Double.parseDouble(textFieldValue.getText());
        if (convertFrom != null && convertTo != null) {
            iConverter.convertSomethingToStandard(convertFrom, value);
            String result = String.valueOf(iConverter.convertStandardToSomething(convertTo));
            textAreaResult.setText("В категории " + category + "Была произведена конвертация.\n" +
                    value + " " + convertFrom + " = " + result + " " + convertTo + ".");
        } else {
            textAreaResult.setText("Неккоректно введенные данные (см. ?)");
        }

    }
}
