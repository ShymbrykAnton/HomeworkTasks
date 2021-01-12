package SimpleCalcSwing.ButtonListeners;

import SimpleCalcSwing.Blogic.Math.Calculations;
import SimpleCalcSwing.Utils.Constants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import static SimpleCalcSwing.Utils.Constants.ErrorText.INPUT_MISMATCH;
import static SimpleCalcSwing.Utils.Constants.Operation;

public class ButtonClickListener implements ActionListener {

    private final JTextField textFieldNumber1;
    private final JTextField textFieldNumber2;
    private final JTextField textFieldOperation;
    private final JTextArea textAreaResult;
    private final Calculations calculations;

    public ButtonClickListener(JTextField textFieldNumber1, JTextField textFieldNumber2, JTextField textFieldOperation,
                               JTextArea textAreaResult, Calculations calculations) {
        this.textFieldNumber1 = textFieldNumber1;
        this.textFieldNumber2 = textFieldNumber2;
        this.textFieldOperation = textFieldOperation;
        this.textAreaResult = textAreaResult;
        this.calculations = calculations;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double number1 = Double.parseDouble(textFieldNumber1.getText());
        double number2 = Double.parseDouble(textFieldNumber2.getText());
        String operation = textFieldOperation.getText();
        operation = operation.toLowerCase(Locale.ROOT);
        double result = 0;
        try {
            switch (operation) {
                case Operation.PLUS:
                    result = calculations.getSum(number1, number2);
                    break;
                case Operation.MINUS:
                    result = calculations.getDifference(number1, number2);
                    break;
                case Operation.MULTIPLY:
                    result = calculations.getMultiply(number1, number2);
                    break;
                case Operation.DIVISION:
                    result = calculations.getDivision(number1, number2);
                    break;
                case Operation.ROOT:
                    result = calculations.getRoot(number1, number2);
                    break;
                case Operation.POW:
                    result = calculations.getPow(number1, number2);
                    break;
                default:
                    textAreaResult.setText(INPUT_MISMATCH);
                    break;
            }
        } catch (ArithmeticException exception) {
            textAreaResult.setText(exception.getMessage());
            return;
        }
        String resultIntOrDouble = result % 1 == 0 ? String.valueOf((int) result) : String.valueOf(result);
        textAreaResult.setText(resultIntOrDouble);
    }
}
