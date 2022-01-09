package TwoDimensionalArrayExercises;

import java.lang.reflect.Array;

public class General {

    public static void main(String[] args) {
        /*
        Napisz program składający się z jednej klasy o dowolnej nazwie. W metodzie main zadeklaruj tablicę dwuwymiarową
        liczb typu double. Wypełnij ją liczbami zgodnie ze schematem zawartym w pliku schemat danych.png

        Wylicz i wyświetl na ekranie wyniki poniżej opisanych działań:

        * Sumę iloczynów przekątnych tablicy,
        * iloczyn sum środkowego wiersza i środkowej kolumny tablicy,
        * sumę wszystkich elementów znajdujących się przy krawędzi tablicy.
         */
        double[] data = {1.0, 1.5, 2.0, 2.5, 3.0};
        double[][] twoDimensionalTable = new double[3][3];
        int counter = -1;
        for (int i = 0; i < 3; i++){
            System.arraycopy(data, ++counter, twoDimensionalTable[i], 0, 3);
        }
        System.out.println(showResults(twoDimensionalTable));
    }

    private static double[] calculate(double[][] array){
        double ratioSum = (array[0][0]*array[1][1]*array[2][2])+(array[0][2]*array[1][1]*array[2][0]);
        double rowAndColumnRatioSum = (array[1][0]+array[1][1]+array[1][2])*(array[0][1]+array[1][1]+array[2][1]);
        double tableEdgeElementsSum = array[0][0]+array[0][1]+array[0][2]+array[1][0]+array[1][2]+array[2][0]+
                array[2][1]+array[2][2];
        return new double[]{ratioSum, rowAndColumnRatioSum, tableEdgeElementsSum};
    }

    public static String showResults(double[][] arr){
        double[] res = calculate(arr);
        return "Suma iloczynów przekątnych tablicy: " + res[0] + '\n' +
                "Iloczyn sum środkowego wiersza i środkowej kolumny tablicy: " + res[1] + '\n' +
                "Suma wszystkich elementów znajdujących się przy krawędzi tablicy: " + res[2];
    }
}
