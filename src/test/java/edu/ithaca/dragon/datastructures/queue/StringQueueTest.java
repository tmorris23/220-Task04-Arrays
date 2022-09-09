package edu.ithaca.dragon.datastructures.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class StringQueueTest {

    @Test
    public void testQueues(){
        int numToTestWith=5;
        //TODO: here you need to send new ArrayStringQueues (once you made the class), not null
        enqueueDequeueIsEmptyTest(null, numToTestWith);
        testDequeueOnEmpty(null);
        testMakeEmpty(null, numToTestWith);
    }

    public void enqueueDequeueIsEmptyTest(StringQueue myQueue, int queueSize){
        assertTrue(myQueue.isEmpty());
        for (int i=0; i<queueSize; i++){
            myQueue.enqueue(Integer.toString(i));
            assertFalse(myQueue.isEmpty());
        }
        for (int i=0; i<queueSize; i++){
            assertFalse(myQueue.isEmpty());
            assertEquals(Integer.toString(i), myQueue.dequeue());
        }
        assertTrue(myQueue.isEmpty());

        myQueue.enqueue("a");
        myQueue.enqueue("b");
        myQueue.enqueue("c");
        assertEquals("a", myQueue.dequeue());
        assertEquals("b", myQueue.dequeue());
        myQueue.enqueue("x");
        myQueue.enqueue("y");
        assertEquals("c", myQueue.dequeue());
        assertEquals("x", myQueue.dequeue());
        assertEquals("y", myQueue.dequeue());
    }

    public void testDequeueOnEmpty(StringQueue emptyQueue){
        assertTrue(emptyQueue.isEmpty());
        assertThrows(NoSuchElementException.class, () -> emptyQueue.dequeue() );
    }

    public void testMakeEmpty(StringQueue myQueue, int queueSize){
        assertTrue(myQueue.isEmpty());
        for (int i=0; i<queueSize; i++){
            myQueue.enqueue(Integer.toString(i));
            assertFalse(myQueue.isEmpty());
        }
        myQueue.makeEmpty();
        testDequeueOnEmpty(myQueue);
        enqueueDequeueIsEmptyTest(myQueue, queueSize);
    }
}