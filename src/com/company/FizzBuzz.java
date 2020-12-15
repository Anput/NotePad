package com.company;

public class FizzBuzz {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i <= 100, i++){

        }

        if( int i % 3 == 0){
            System.out.println(i + ", " + "Fizz");
        }

        if(int i % 5 == 0){
            System.out.println(i + ", " + "Buzz");
        }
        if(int i % 5 && int i % 3 == 0){
            System.out.println(i + ", " + "FizzBuzz");
        }else{
            System.out.println(i + ", ");
        }
    }
}
