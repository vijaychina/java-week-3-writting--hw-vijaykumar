package homework_week_3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        // Numeric Array deted claration
        int [] numArray = {
                1789, 2035, 1899, 2040, 2255, 7897, 1455, 787};
        // String Array declaration
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Sierra", "peter", "Kilo"};
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
        }
    }

