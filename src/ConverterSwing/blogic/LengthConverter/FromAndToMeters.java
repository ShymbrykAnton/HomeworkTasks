package ConverterSwing.blogic.LengthConverter;

import ConverterSwing.blogic.IConverter;

import java.util.InputMismatchException;
import java.util.Locale;

import static ConverterSwing.Utils.Constants.Length;

public class FromAndToMeters implements IConverter {
    private double valueInMeters;

    public void convertSomethingToStandard(String cmd1, double value) {
        switch (cmd1.toLowerCase(Locale.ROOT).trim()) {
            case Length.METER:
                valueInMeters = value;
                break;
            case Length.KILOMETER:
                valueInMeters = value * 1000;
                break;
            case Length.MILE:
                valueInMeters = value * 1609.344;
                break;
            case Length.NAUTICAL_MILE:
                valueInMeters = value * 1852;
                break;
            case Length.CABLE:
                valueInMeters = value * 219.45600;
                break;
            case Length.LEAGUE:
                valueInMeters = value * 5556;
                break;
            case Length.FOOT:
                valueInMeters = value * 0.3048;
                break;
            case Length.YARD:
                valueInMeters = value * 0.9144;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели первую размерность");
        }
    }

    public double convertStandardToSomething(String cmd2) {
        double result;
        switch (cmd2.toLowerCase(Locale.ROOT).trim()) {
            case Length.METER:
                result = valueInMeters;
                break;
            case Length.KILOMETER:
                result = valueInMeters * 0.001;
                break;
            case Length.MILE:
                result = valueInMeters * 0.000621371192;
                break;
            case Length.NAUTICAL_MILE:
                result = valueInMeters * 0.000539956803;
                break;
            case Length.CABLE:
                result = valueInMeters * 0.00455672208;
                break;
            case Length.LEAGUE:
                result = valueInMeters * 0.000179985601;
                break;
            case Length.FOOT:
                result = valueInMeters * 3.2808399;
                break;
            case Length.YARD:
                result = valueInMeters * 1.0936133;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели вторую размерность");
        }
        return result;
    }
}
