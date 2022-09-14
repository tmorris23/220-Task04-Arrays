package edu.ithaca.dragon.datastructures.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.datastructures.stack.ArrayStringStack;

public class ArrayUtilTest {

    int numItemsToTestWith = 5;
    ArrayStringStack myArray = new ArrayStringStack();
    ArrayStringStack doubleStack =createDoubleSizeArrayTest (myArray, numItemsToTestWith);

    @Test
    public ArrayStringStack createDoubleSizeArrayTest(ArrayStringStack myStack, int stackSize){
        assertTrue(myStack.isEmpty()); //ensuring that the stack just created is empty
        ArrayStringStack doubleArray = new ArrayStringStack();
        
        for (int i=0; i<stackSize; i++){ //using a for loop to push values into the stack
            myStack.push(Integer.toString(i));
            doubleArray.push(Integer.toString(i));
            assertFalse(myStack.isEmpty());
        }

        for (int i=stackSize; i<(stackSize*2); i++){
            doubleArray.push(Integer.toString(i));
        }
        return doubleArray;
    }
    
}
