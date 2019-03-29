package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
    //check in values in squaredValue are equal to inputArray values squared

        Arrays.sort(inputArray);
        Arrays.sort(squaredValues);

        for (int i= 0; inputArray[i] < inputArray.length; i++) {
            //for (int j = 0; squaredValues[j] <=squaredValues.length; j++) {
                if(!(squaredValues[i] == (inputArray[i]* inputArray[i]) || inputArray[i] == squaredValues[i])) {
                    System.out.println(inputArray[i]);
                    System.out.println(squaredValues[i]);
                    return false;
                //}

            }
        }

        return true;
    }
}
