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
        doubleArray = createDoubleSizeArray(myStack);
        
        assertFalse(doubleArray.isEmpty());
        assertEquals(10,doubleArray.size);
        
    }
    
}
