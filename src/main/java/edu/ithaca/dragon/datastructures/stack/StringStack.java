package edu.ithaca.dragon.datastructures.stack;

public interface StringStack {

    /**
     * @post puts an item onto the "top" of the Stack
     */
    void push(String item);

    /**
     * @post removes an item from the "top" of the Stack
     * @return the item removed
     * @throws NoSuchElementException if the Stack is empty
     */
    String pop();

    /**
     * @return true if the Stack has no items, false otherwise
     */
    boolean isEmpty();

    /**
     * @post all items are removed, this Stack is empty
     */
    void makeEmpty();

}