package ConverterSwing.blogic.TemperatureConverter;

import ConverterSwing.blogic.IConverter;

import java.util.InputMismatchException;
import java.util.Locale;

import static ConverterSwing.Utils.Constants.Temperature;

public class FromAndToCelsius implements IConverter {
    private double valueInCelsius;

    public void convertSomethingToStandard(String cmd1, double value) {
        switch (cmd1.toLowerCase(Locale.ROOT).trim()) {
            case Temperature.CELSIUS:
                valueInCelsius = value;
                break;
            case Temperature.KELVIN:
                valueInCelsius = value - 273.15;
                break;
            case Temperature.FAHRENHEIT:
                valueInCelsius = (value - 32) / 1.8;
                break;
            case Temperature.REAUMUR:
                valueInCelsius = value / 0.8;
                break;
            case Temperature.ROMER:
                valueInCelsius = (40.0 / 21) * (value - 7.5);
                break;
            case Temperature.RANKIN:
                valueInCelsius = (value - 491.67) * (5.0 / 9);
                break;
            case Temperature.NEWTON:
                valueInCelsius = (100.0 / 33) * value;
                break;
            case Temperature.DELISLE:
                valueInCelsius = (100 + value) * (2.0 / 3);
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели первую размерность");
        }
    }

    public double convertStandardToSomething(String cmd2) {
        double result;
        switch (cmd2.toLowerCase(Locale.ROOT).trim()) {
            case Temperature.CELSIUS:
                result = valueInCelsius;
                break;
            case Temperature.KELVIN:
                result = valueInCelsius + 273.15;
                break;
            case Temperature.FAHRENHEIT:
                result = (valueInCelsius * 1.8) + 32;
                break;
            case Temperature.REAUMUR:
                result = valueInCelsius * 0.8;
                break;
            case Temperature.ROMER:
                result = (21.0 / 40) * (valueInCelsius) + 7.5;
                break;
            case Temperature.RANKIN:
                result = (valueInCelsius + 273.15) * (9.0 / 5);
                break;
            case Temperature.NEWTON:
                result = (33.0 / 100) * valueInCelsius;
                break;
            case Temperature.DELISLE:
                result = (100 - valueInCelsius) * (3.0 / 2);
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели вторую размерность");
        }
        return result;
    }
}


