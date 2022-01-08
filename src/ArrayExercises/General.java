package ArrayExercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class General {
    /*
    Napisz program, w którym zadeklarujesz dwie tablice typu całkowitoliczbowego. Każda z nich powinna przechowywać po
    3 dowolne liczby typu int. Program powinien wyświetlić sumę wszystkich liczb z obu tablic.

    Następnie zdefiniuj metodę, która realizuje to samo zadanie, czyli przyjmuje dwie tablice, a zwraca sumę wszystkich
    ich elementów.
     */

    public static void main(String[] args) {
        int[] arrayData1 = {22, 11, 84, 4, 10};
        int[] arrayData2 = {221, 18, 122};
        System.out.println(arraySum(arrayData1, arrayData2));

    }

    public static int arraySum(int[] array1, int[] array2){
        int[] newTab = new int[array1.length+array2.length];
        System.arraycopy(array1, 0, newTab, 0, array1.length);
        System.arraycopy(array2, 0, newTab, array1.length, array2.length);
        int summary = 0;
        for (int el :
                newTab) {
            summary += el;
        }
        return summary;
    }
}
