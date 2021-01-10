package ConverterSwing.blogic.VolumeConverter;

import ConverterSwing.blogic.IConverter;

import java.util.InputMismatchException;
import java.util.Locale;

import static ConverterSwing.Utils.Constants.Volume;

public class FromAndToLiters implements IConverter {
    private double valueInLiters;

    public void convertSomethingToStandard(String cmd1, double value) {
        switch (cmd1.toLowerCase(Locale.ROOT).trim()) {
            case Volume.LITERS:
                valueInLiters = value;
                break;
            case Volume.M3:
                valueInLiters = value * 1000;
                break;
            case Volume.GALLON:
                valueInLiters = value * 3.78541178;
                break;
            case Volume.PINT:
                valueInLiters = value * 0.473176473;
                break;
            case Volume.QUART:
                valueInLiters = value * 0.946352946;
                break;
            case Volume.BARREL:
                valueInLiters = value * 117.347765;
                break;
            case Volume.CUBIC_FOOT:
                valueInLiters = value * 28.32;
                break;
            case Volume.CUBIC_INCH:
                valueInLiters = value * 0.016387064;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели первую размерность");
        }
    }

    public double convertStandardToSomething(String cmd2) {
        double result;
        switch (cmd2.toLowerCase(Locale.ROOT).trim()) {
            case Volume.LITERS:
                result = valueInLiters;
                break;
            case Volume.M3:
                result = valueInLiters * 0.001;
                break;
            case Volume.GALLON:
                result = valueInLiters * 0.264172052;
                break;
            case Volume.PINT:
                result = valueInLiters * 2.11337642;
                break;
            case Volume.QUART:
                result = valueInLiters * 1.05668821;
                break;
            case Volume.BARREL:
                result = valueInLiters * 0.0062898108;
                break;
            case Volume.CUBIC_FOOT:
                result = valueInLiters * 0.0353146667;
                break;
            case Volume.CUBIC_INCH:
                result = valueInLiters * 61.02;
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели вторую размерность");
        }
        return result;
    }
}
