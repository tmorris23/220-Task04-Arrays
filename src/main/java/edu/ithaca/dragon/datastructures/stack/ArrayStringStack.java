package edu.ithaca.dragon.datastructures.stack;

public class ArrayStringStack implements StringStack{

    private String[] myArray;
    private int size = 5;
    private int index =0;

    public ArrayStringStack(){
        myArray = new String[5];
    }
    
    @Override
    public void push(String item) {
        // TODO Auto-generated method stub
            myArray[index] = item;
            index+=1;
    }

    @Override
    public String pop() {
        // TODO Auto-generated method stub
        
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void makeEmpty() {
        // TODO Auto-generated method stub
        
    }
    
    
}
