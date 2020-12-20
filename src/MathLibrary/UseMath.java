package MathLibrary;

import java.text.DecimalFormat;

public class UseMath {
    final String C = "#0.00";

    public String getFlightDistanceByDegree(double speed, double angle) {
        if (speed < 0 || angle < 0) {
            System.out.println("Скорость и угол наклона ствола должны быть положительны");
            System.exit(0);
        }
        speed *= (1000.0 / 3600);
        double flightDistance = Math.pow(speed, 2) / 9.80665 * Math.sin(Math.toRadians(2 * angle));
        speed *= (3600 / 1000.0);
        String result = new DecimalFormat(C).format(flightDistance);
        return "Расстояние полёта снаряда при скорости: " + speed + " км/ч и угле наклона ствола: " + angle + " градусов равно: " + result + " метров";
    }

    public String getFlightDistanceByRadians(double speed, double angle) {
        if (speed < 0 || angle < 0) {
            System.out.println("Скорость и угол наклона ствола должны быть положительны");
            System.exit(0);
        }
        speed *= (1000.0 / 3600);
        double flightDistance = Math.pow(speed, 2) / 9.80665 * Math.sin(2 * angle);
        speed *= (3600 / 1000.0);
        String result = new DecimalFormat(C).format(flightDistance);
        return "Расстояние полёта снаряда при скорости: " + speed + " км/ч и угле наклона ствола: " + angle + " радианов равно: " + result + " метров";
    }

    public String getDistanceBetweenCars(double firstCarSpeed, double secondCarSpeed, double time, double startDistance) {
        double distance = Math.abs((firstCarSpeed + secondCarSpeed) * time + startDistance);
        return "Расстояние между машинами, при скорости первой и второй машины: " + firstCarSpeed + " и " + secondCarSpeed + " км/ч и начальном расстоянии между ними: " + startDistance + " км через " + time + " часов равно " + distance + " км";
    }

    public boolean isDotInsideArea(double x, double y) {
        //Прежде всего обратим внимание на то, что эту сложную фигуру целесообразно разбить на несколько более простых: треугольник, лежащий в I и IV
        // координатных четвертях и треугольник, лежащий во II и III четвертях.
        // Таким образом, точка может попасть внутрь одной из этих фигур, либо на линию, их ограничивающую.
        // Количество отношений, описывающих какую-либо область, обычно совпадает с количеством линий, эту область ограничивающих.
        // Чтобы точка попала внутрь области, необходима истинность каждого из отношений, поэтому над ними выполняется операция AND.
        // Так вся область была разбита на несколько, то между отношениями, описывающими каждую из них, используется операция OR.
        return (x >= 0 && y >= 1.5 * x - 1 && y <= x) || (x <= 0 && y >= -1.5 * x - 1 && y <= x);
    }

    public String calculateExpression(double x) {
        double upPart, downPart, firstPart, secondPart, result;
        upPart = (6 * Math.log(Math.sqrt(Math.exp(x + 1) + 2 * Math.exp(x) * Math.cos(Math.toDegrees(x)))));
        downPart = Math.log(x - Math.exp(x + 1) * Math.sin(Math.toDegrees(x)));
        firstPart = upPart / downPart;
        secondPart = Math.abs(Math.cos(Math.toDegrees(x)) / Math.exp(Math.sin(Math.toDegrees(x))));
        result = firstPart + secondPart;
        return "Результат вычисления выражения: " + result;
    }
}
