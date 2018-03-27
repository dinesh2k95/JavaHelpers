package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
//        solution("abcd aabc bd", "aaa aa");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(input.charAt(i)));
        }
        return reversed;
    }

    public static int[] solution(String a, String b) {
        String[] first = a.split(" ");
        String[] second = b.split(" ");
        int[] firstMinArray = new int[first.length];
        int[] secondMinArray = new int[second.length];
        for (int i = 0; i < first.length; i++) {
            firstMinArray[i] = findMinOccurences(first[i]);
        }
        for (int i = 0; i < second.length; i++) {
            secondMinArray[i] = findMinOccurences(second[i]);
        }
        int[] c = new int[secondMinArray.length];
        for (int i = 0; i < secondMinArray.length; i++) {
            int returnValue = 0;
            for (int firstValue : firstMinArray) {
                if (secondMinArray[i] > firstValue) {
                    returnValue ++;
                }
            }
            c[i] = returnValue;
        }
        return c;
    }

    public static int findMinOccurences(String input) {
        int minOccurences = 0;
        List<Character> strArr = new ArrayList<>(input.length());
        for (char c : input.toCharArray()){
            strArr.add(c);
        }
        Character min = Collections.min(strArr);
        for (Character character : strArr) {
            if (min == character) {
                minOccurences ++;
            }
        }
        return minOccurences;
    }
}
