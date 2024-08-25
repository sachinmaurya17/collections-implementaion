package org.example;
import java.util.Arrays;

public class DynamicArray<T> implements IDynamicArray {

    public int capacity;

    public int size;

    public T[] arr;

    @SuppressWarnings("unchecked")
    public DynamicArray(int capacity) {
        this.arr = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public DynamicArray() {
        this(8);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object value) {
       if(size == capacity) {
           resize();
       }else{
           arr[size++] = (T) value;
       }
    }


    public void resize() {
        capacity = capacity * 2;
        arr = Arrays.copyOf(arr,capacity);
    }

    public String toString(){
        return Arrays.toString(arr);
    }
}
