package edu.ithaca.dragon.datastructures.array;

import edu.ithaca.dragon.datastructures.stack.ArrayStringStack;

public class ArrayUtil {

    
    /**
     * @param arrayToDouble an array that you want a bigger copy of
     * @return an array with a copy of all the references in the original array, but with twice the size
     */
    public static ArrayStringStack createDoubleSizeArray(String[] arrayToDouble){

        ArrayStringStack doubleArray = new ArrayStringStack();

        for (int i=0; i<arrayToDouble.length; i++){ //using a for loop to push values into the stack
            doubleArray.push(Integer.toString(i));
        }

        for (int i=arrayToDouble.length; i<(arrayToDouble.length*2); i++){
            doubleArray.push(Integer.toString(i));
        }
        return doubleArray;
    }

}
