package ConverterSwing.blogic;

public interface IConverter {
    void convertSomethingToStandard(String cmd1, double Value);

    double convertStandardToSomething(String cmd2);
}
