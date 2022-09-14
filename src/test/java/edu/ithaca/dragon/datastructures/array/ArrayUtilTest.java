package edu.ithaca.dragon.datastructures.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.datastructures.array.ArrayUtil;
import edu.ithaca.dragon.datastructures.stack.ArrayStringStack;

public class ArrayUtilTest {

    @Test
        public void testDouble(){

        int numItemsToTestWith = 5;
        String[] myArray = {
            "0","1","2","3","4"
        };
        createDoubleSizeArrayTest(myArray);
}
    @Test
    public void createDoubleSizeArrayTest( String[] myStack){
        assertEquals(5,myStack.length); //ensuring that the stack just created is empty

        ArrayStringStack doubleArray = new ArrayStringStack();
        ArrayUtil.createDoubleSizeArray(myStack);
        
        assertFalse(doubleArray.isEmpty());
        assertEquals(10,doubleArray.getSize());
        
    }
    
}
