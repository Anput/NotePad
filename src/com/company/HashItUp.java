package com.company;

import java.util.HashMap;

public class HashItUp {

    public static void main(String[] args) {
	// example array to test
        String[] array = {"a", "bb", "a", "bb"};
        //call method in main
        wordLen(array);
    }

    public static HashMap<String, Integer> wordLen(String[] strings){
        //initialize hashmap - don't need to repeat parameters in "new"
        HashMap<String, Integer> map = new HashMap<>();

        //take every index of array & make hashmap key
        //take length of every index & make corresponding hashmap value
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
            //print array
            System.out.println(strings[i]);
            //print array length
            System.out.println(strings[i].length());
        }
        //return hashmap
        return map;
    }
}
