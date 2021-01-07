package ConverterSwing.blogic.WeightConverter;

import ConverterSwing.blogic.IConverter;

import java.util.InputMismatchException;
import java.util.Locale;

import static ConverterSwing.Utils.Constants.Weight;

public class FromAndToGrams implements IConverter {
    double valueInKilograms;

    public void convertSomethingToStandard(String cmd1, double Value) {
        switch (cmd1.toLowerCase(Locale.ROOT).trim()) {
            case Weight.KILOGRAM:
                valueInKilograms = Value;
                break;
            case Weight.GRAM:
                valueInKilograms = Value * 0.001;
                break;
            case Weight.ENG_POUND:
                valueInKilograms = Value * 0.454;
                break;
            case Weight.POUND:
                valueInKilograms = Value * 0.45359237;
                break;
            case Weight.STONE:
                valueInKilograms = Value * 6.35029318;
                break;
            case Weight.RUS_POUND:
                valueInKilograms = Value * 0.409512037;
                break;
            case Weight.CUBIC_FOOT:
                valueInKilograms = Value * 28.32;
                break;
            case Weight.CUBIC_INCH:
                valueInKilograms = Value * 0.013963636363637;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели первую размерность");
        }
    }

    public double convertStandardToSomething(String cmd2) {
        double result;
        switch (cmd2.toLowerCase(Locale.ROOT).trim()) {
            case Weight.KILOGRAM:
                result = valueInKilograms;
                break;
            case Weight.GRAM:
                result = valueInKilograms * 1000;
                break;
            case Weight.ENG_POUND:
                result = valueInKilograms * 2.2046;
                break;
            case Weight.POUND:
                result = valueInKilograms * 2.20462262;
                break;
            case Weight.STONE:
                result = valueInKilograms * 0.157473044;
                break;
            case Weight.RUS_POUND:
                result = valueInKilograms * 2.44193066;
                break;
            case Weight.CUBIC_FOOT:
                result = valueInKilograms * 0.035;
                break;
            case Weight.CUBIC_INCH:
                result = valueInKilograms * 71.61458;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели вторую размерность");
        }
        return result;
    }
}
