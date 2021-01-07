package ConverterSwing.blogic.TemperatureConverter;

import ConverterSwing.blogic.IConverter;

import java.util.InputMismatchException;

import static ConverterSwing.Utils.Constants.Temperature;

public class FromAndToCelsius implements IConverter {
    double valueInCelsius;

    public void convertSomethingToStandard(String cmd1, double Value) {
        switch (cmd1) {
            case Temperature.CELSIUS:
                valueInCelsius = Value;
                break;
            case Temperature.KELVIN:
                valueInCelsius = Value - 273.15;
                break;
            case Temperature.FAHRENHEIT:
                valueInCelsius = (Value - 32) / 1.8;
                break;
            case Temperature.REAUMUR:
                valueInCelsius = Value * 0.8;
                break;
            case Temperature.ROMER:
                valueInCelsius = (40 / 21) * (Value - 7.5);
                break;
            case Temperature.RANKIN:
                valueInCelsius = (Value - 491.67) * (5 / 9);
                break;
            case Temperature.NEWTON:
                valueInCelsius = (100 / 33) * Value;
                break;
            case Temperature.DELISLE:
                valueInCelsius = 100 - (Value * (2 / 3));
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели первую размерность");
        }
    }

    public double convertStandardToSomething(String cmd2) {
        double result;
        switch (cmd2) {
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
                result = valueInCelsius * 1.25;
                break;
            case Temperature.ROMER:
                result = (21 / 40) * (valueInCelsius) + 7.5;
                break;
            case Temperature.RANKIN:
                result = (valueInCelsius + 273.15) * (9 / 5);
                break;
            case Temperature.NEWTON:
                result = (33 / 100) * valueInCelsius;
                break;
            case Temperature.DELISLE:
                result = (100 - valueInCelsius) * (3 / 2);
                break;
            default:
                throw new InputMismatchException("Вы неправильно ввели первую размерность");
        }
        return result;
    }
}


