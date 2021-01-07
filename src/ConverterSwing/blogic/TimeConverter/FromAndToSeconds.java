package ConverterSwing.blogic.TimeConverter;

import ConverterSwing.blogic.IConverter;

import java.util.InputMismatchException;
import java.util.Locale;

import static ConverterSwing.Utils.Constants.Time;

public class FromAndToSeconds implements IConverter {
    double valueInSeconds;

    public void convertSomethingToStandard(String cmd1, double Value) {
        switch (cmd1.toLowerCase(Locale.ROOT).trim()) {
            case Time.SECONDS:
                valueInSeconds = Value;
                break;
            case Time.MIN:
                valueInSeconds = Value * 60;
                break;
            case Time.HOUR:
                valueInSeconds = Value * 3600;
                break;
            case Time.DAYS:
                valueInSeconds = Value * 86_400;
                break;
            case Time.WEEKS:
                valueInSeconds = Value * 604_800;
                break;
            case Time.MONTHS:
                valueInSeconds = Value * 2_629_743.83;
                break;
            case Time.YEARS:
                valueInSeconds = Value * 31_556_926;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели первую размерность");
        }
    }

    public double convertStandardToSomething(String cmd2) {
        double result;
        switch (cmd2.toLowerCase(Locale.ROOT).trim()) {
            case Time.SECONDS:
                result = valueInSeconds;
                break;
            case Time.MIN:
                result = valueInSeconds * 0.01666666667;
                break;
            case Time.HOUR:
                result = valueInSeconds * 0.00027777778;
                break;
            case Time.DAYS:
                result = valueInSeconds * 0.00001157407407407407;
                break;
            case Time.WEEKS:
                result = valueInSeconds * 0.00000165343915343915;
                break;
            case Time.MONTHS:
                result = valueInSeconds * 0.00000038026486208173;
                break;
            case Time.YEARS:
                result = valueInSeconds * 0.00000003170979198376;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели вторую размерность");
        }
        return result;
    }
}
