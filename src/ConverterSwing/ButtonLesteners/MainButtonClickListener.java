package ConverterSwing.ButtonLesteners;

import ConverterSwing.Factory.CategoryFactory;
import ConverterSwing.blogic.IConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

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
        try {
            iConverter = factory.getInstanceByCategory(category);
        } catch (InputMismatchException exception) {
            textAreaResult.setText(exception.getMessage());
        }
        String convertFrom = textFieldConvertFrom.getText();
        String convertTo = textFieldConvertTo.getText();
        double value = Double.parseDouble(textFieldValue.getText());
        try {
            iConverter.convertSomethingToStandard(convertFrom, value);
            String result = String.valueOf(iConverter.convertStandardToSomething(convertTo));
            textAreaResult.setText("  Выбранная категория: " + category + ".\n" +
                    "  " + value + " " + convertFrom + " = " + result + " " + convertTo + ".");
        } catch (InputMismatchException exception) {
            textAreaResult.setText(exception.getMessage());
        }
    }
}
