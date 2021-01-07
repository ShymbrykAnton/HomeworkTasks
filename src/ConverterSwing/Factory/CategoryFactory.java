package ConverterSwing.Factory;

import ConverterSwing.blogic.IConverter;
import ConverterSwing.blogic.LengthConverter.FromAndToMeters;
import ConverterSwing.blogic.TemperatureConverter.FromAndToCelsius;
import ConverterSwing.blogic.TimeConverter.FromAndToSeconds;
import ConverterSwing.blogic.VolumeConverter.FromAndToLiters;
import ConverterSwing.blogic.WeightConverter.FromAndToGrams;

import static ConverterSwing.Utils.Constants.Category;

import java.util.InputMismatchException;
import java.util.Locale;

public class CategoryFactory {
    private final IConverter lengthConverter = new FromAndToMeters();
    private final IConverter temperatureConverter = new FromAndToCelsius();
    private final IConverter timeConverter = new FromAndToSeconds();
    private final IConverter volumeConverter = new FromAndToLiters();
    private final IConverter weightConverter = new FromAndToGrams();


    public IConverter getInstanceByCategory(String category) {
        IConverter converter;
        switch (category.toLowerCase(Locale.ROOT)) {
            case Category.LENGTH:
                converter = lengthConverter;
                break;
            case Category.TEMPERATURE:
                converter = temperatureConverter;
                break;
            case Category.TIME:
                converter = timeConverter;
                break;
            case Category.VOLUME:
                converter = volumeConverter;
                break;
            case Category.WEIGHT:
                converter = weightConverter;
                break;
            default:
                throw new InputMismatchException("Неккоректно введенные данные (см.?).");
        }
        return converter;
    }
}
