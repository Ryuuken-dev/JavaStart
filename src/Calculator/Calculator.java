package Calculator;

public class Calculator {

    private double add(double a, double b){
        return roundTo2DecimalPlace(a + b);
    }

    private double subtract(double a, double b){
        return roundTo2DecimalPlace(a - b);
    }

    private double multiply(double a, double b){
        return roundTo2DecimalPlace(a * b);
    }

    private static double roundTo2DecimalPlace(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    private double divide(double a, double b){
        return roundTo2DecimalPlace(a/b);
    }

    public double getResult(UsersChoice choice){
        double result = 0;
        switch (choice.getOperationType()){
            case '+':
                result = add(choice.getFirstNumber(), choice.getSecondNumber());
                break;
            case '-':
                result = subtract(choice.getFirstNumber(), choice.getSecondNumber());
                break;
            case '/':
                result = divide(choice.getFirstNumber(), choice.getSecondNumber());
                break;
            case '*':
                result = multiply(choice.getFirstNumber(), choice.getSecondNumber());
        }
        return result;
    }

}
