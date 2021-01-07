package ConverterSwing.blogic;

public interface IConverter {
    public void convertSomethingToStandard(String cmd1, double Value);

    public double convertStandardToSomething(String cmd2);
}
