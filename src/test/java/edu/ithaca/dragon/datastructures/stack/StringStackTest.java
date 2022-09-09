package edu.ithaca.dragon.datastructures.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class StringStackTest {
    
    @Test
    public void testStack(){
        int numItemsToTestWith = 5;
        pushPopIsEmptyTest(new ArrayStringStack(), numItemsToTestWith);
        testPopOnEmpty(new ArrayStringStack());
        testMakeEmpty(new ArrayStringStack(), numItemsToTestWith);
    }

    public void pushPopIsEmptyTest(StringStack myStack, int stackSize){
        assertTrue(myStack.isEmpty()); //ensuring that the stack just created is empty
        
        for (int i=0; i<stackSize; i++){ //using a for loop to push values into the stack
            myStack.push(Integer.toString(i));
            assertFalse(myStack.isEmpty());
        }
        for (int i=stackSize-1; i>=0; i--){ //using a for loop to remove values from the stack from right to left
            assertFalse(myStack.isEmpty());
            assertEquals(Integer.toString(i), myStack.pop());
        }
        assertTrue(myStack.isEmpty()); // stack should be empty

        myStack.push("a"); // pushes more items into the stack 
        myStack.push("b");
        myStack.push("c");
        assertFalse(myStack.isEmpty()); //stack shouldn't be empty here
        assertEquals("c", myStack.pop());
        assertEquals("b", myStack.pop());
        assertFalse(myStack.isEmpty()); //a should still be in the stack 
        myStack.push("x");
        myStack.push("y");
        assertFalse(myStack.isEmpty());
        assertEquals("y", myStack.pop());
        assertEquals("x", myStack.pop());
        assertEquals("a", myStack.pop());
        assertTrue(myStack.isEmpty());
    }

    public void testPopOnEmpty(StringStack emptyStack){ //testing is NoSuchElementException happens when popping on an empty stack
        assertTrue(emptyStack.isEmpty());
        assertThrows(NoSuchElementException.class, () -> emptyStack.pop());
    }

    public void testMakeEmpty(StringStack myStack, int stackSize){ //testing if empty
        assertTrue(myStack.isEmpty());//calling ifEmpty on an empty stack
        for (int i=0; i<stackSize; i++){
            myStack.push(Integer.toString(i));
            assertFalse(myStack.isEmpty());//calling ifEmpty on a populated stack
        }
        myStack.makeEmpty();
        testPopOnEmpty(myStack);
        pushPopIsEmptyTest(myStack, stackSize);
    }

}
