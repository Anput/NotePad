package com.company;

public class Recursion {

    public static void main(String[] args) {
        factorial(5);

    }

    public static int factorial(int num) {
        int result = 1;
        int i;

        for (i = 2; i <= num; i++) {
            result *= i;
        }
        return result;

    }



//    public static void main(String[] args) {
//        arrayRecursive();
//    }
//
//    public static void arrayRecursive(int[] array, int index){
//        if(index != -1){
//            arrayRecursive(array, index - 1);
//            System.out.println(array[index]);
//        }
//
}
