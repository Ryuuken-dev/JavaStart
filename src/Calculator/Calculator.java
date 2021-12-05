package Calculator;

public class Calculator {

    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public static double roundTo2DecimalPlace(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public double divide(double a, double b){
        return roundTo2DecimalPlace(a/b);
    }

}
