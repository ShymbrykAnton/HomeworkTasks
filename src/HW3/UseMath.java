package HW3;

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
    private double area (double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }

    public boolean isDotInsideArea(double x, double y) {
        double xA = 0, yA = 0, xB = 0, yB = -1, xC = -2, yC = 2, xD = 2, yD = 2;
        double area1 = area(xA, yA, xB, yB, xC, yC);
        double area2 = area(xA, yA, xB, yB, xD, yD);

        double A1 = area(x, y, xB, yB, xC, yC);
        double A2 = area(xA, yA, x, y, xC, yC);
        double A3 = area(xA, yA, xB, yB, x, y);

        double D1 = area(x, y, xB, yB, xD, yD);
        double D2 = area(xA, yA, x, y, xD, yD);
        double D3 = area(xA, yA, xB, yB, x, y);

        return (area1 == A1 + A2 + A3) || (area2 == D1 + D2 + D3);
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
