package Debugging;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenAdder {

    /*
    Zadaniem programu jest wczytanie od użytkownika 5 liczb parzystych, odwrócenie ich kolejności, a na końcu
    wyświetlenie odwróconej tablicy. W przypadku podawania liczb nieparzystych program powinien się "cofać" i wczytywać
    liczby tak długo, aż ktoś nie poda w sumie 5 liczb parzystych.

    Posiłkując się debuggerem prześledź działanie programu, wykryj i wyeliminuj błędy.
     */

    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        System.out.println("Przed odwróceniem kolejności: " + Arrays.toString(array));
        System.out.println("Po odwróceniu kolejności: " + Arrays.toString(reverseArray(array)));
    }

    /**
     * @param size - number of elements to read
     * @return array containing even numbers
     */
    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        while (isInTab(result, 0)){
            long howManyElementsInTab = IntStream.of(result).filter(i -> i == 0).count();
            List<Integer> indexesOfZeroElements = getIndexesOfElements(result, 0);
            for (int i = 0; i < howManyElementsInTab; i++) {
                System.out.println("Podaj kolejną liczbę:");
                int next = scanner.nextInt();
                if(isEven(next))
                    result[indexesOfZeroElements.get(i)] = next;
            }
            if (IntStream.of(result).filter(i -> i == 0).count() > 0){
                System.out.println("Podałeś " + IntStream.of(result).filter(i -> i == 0).count() + " liczby nieparzyste!");
            }
        }
        scanner.close();

        return result;
    }

    /**
     *
     * @param number - number to be checked
     * @return true if number is even, or false otherwise
     */
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * @param array - array to be reversed
     * @return - reversed array
     */
    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        int index = reversed.length-1;
        for (int i = 0; i < reversed.length; i++) {
            reversed[index--] = array[i];
        }
        return reversed;
    }

    private static boolean isInTab(int[] tab, int val) {
        boolean result = false;
        for (int el :
                tab) {
            if (el == val){
                result = true;
                break;
            }
        }
        return result;
    }

    private static List<Integer> getIndexesOfElements(int[] tab, int element){

        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == element){
                indexes.add(i);
            }
        }
        return indexes;
    }
}

