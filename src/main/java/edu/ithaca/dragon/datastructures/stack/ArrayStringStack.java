package edu.ithaca.dragon.datastructures.stack;
import java.util.NoSuchElementException;

public class ArrayStringStack implements StringStack{

    private String[] myArray;
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
    public String pop() throws NoSuchElementException{
        // TODO Auto-generated method stub
        String value = myArray[index-1];
        index --;
        return value;
    }

    @Override
    public boolean isEmpty() throws NoSuchElementException {
        // TODO Auto-generated method stub
        if( index ==0){
            return true;
        }

        else{
            return false;
        }
    }

    @Override
    public void makeEmpty() throws NoSuchElementException{
        // TODO Auto-generated method stub
        for (int i= index; i>= 0; i--){
            index --;
        }
        
    }
    
    
}
