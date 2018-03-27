package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by dinesh on 6/29/17.
 */
public class Hello {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 8;
        String[] input1 = new String[n];

        for (int i = 0; i < n; i++) {

            input1[i] = sc.next();

        }

        String[] input = new String[]{"1", "3", "1", "4", "5", "6", "3", "9"};

        int totalDuplicateElements = 0;

        for (int i = 0; i < input.length; i++) {
            String value = input[i];
            Integer integerValue = Integer.valueOf(value);
            for (int j = 0; j < input.length; j++) {
                if (i != j) {
                    if (Objects.equals(integerValue, Integer.valueOf(input[j]))) {
                        totalDuplicateElements++;
                        break;
                    }
                }
            }
        }
        System.out.println(totalDuplicateElements);
    }


}
