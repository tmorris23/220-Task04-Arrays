package edu.ithaca.dragon.datastructures.stack;
import java.util.NoSuchElementException;

public class ArrayStringStack implements StringStack{

    private String[] myArray;
    private int size =5;
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
    public String pop(){
        // TODO Auto-generated method stub
        if (index ==0 || index> size){
            throw new NoSuchElementException("List is empty");
        }
        else{
            String value = myArray[index-1];
            index --;
            return value;
        }
    }

    @Override
    public boolean isEmpty(){
        // TODO Auto-generated method stub
        if( index ==0){
            return true;
        }

        else{
            return false;
        }
    }

    @Override
    public void makeEmpty(){
        // TODO Auto-generated method stub
        for (int i= index; i>= 0; i--){
            index --;
        }
        
    }
    
    
}
