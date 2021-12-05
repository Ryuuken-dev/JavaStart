package Exercises.MethodOverloading;

public class Calculator {

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double add(double num1, double num2, double num3){
        return add(num1, num2) + num3;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double subtract(double num1, double num2, double num3){
        return subtract(num1, num2) - num3;
    }
}
