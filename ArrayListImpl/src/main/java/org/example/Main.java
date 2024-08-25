package org.example;
public class Main {
    public static void main(String[] args) {

        IDynamicArray<Integer> array = new DynamicArray<>();

        for (int i = 0; i < 11; i++) {
            array.add(i);
        }
        System.out.println(array.toString());



    }
}