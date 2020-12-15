package com.company;

import java.util.Arrays;

public class Anagram {

    //Given two strings s and t , write a function to determine if t is an anagram of s.

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));

    }

    public static boolean isAnagram(String s, String t){
        //2 conditions must be met:
        //first - both string s & string t must be same length
        //second - elements in both strings must be same elements

        //create if statement for condition 1
        if (s.length() != t.length()){
            return false;
        }
        //convert string to char array for comparison
        char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();
        //sort arrays
        Arrays.sort(sTemp);
        Arrays.sort(tTemp);

        //create if statement for condition 2
        for (int i = 0; i < s.length(); i++) {
            if (sTemp[i] != tTemp[i]){
                return false;
            }
        }

        return true;
    }
}
