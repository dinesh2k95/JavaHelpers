package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        Integer length = scanner.nextInt();

        ArrayList<Integer> input = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            input.add(i, scanner.nextInt());
        }

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {

                if (input.get(i) < input.get(j)) {

                    int temp = input.get(i);
                    input.set(i, input.get(j));
                    input.set(j, temp);
                }

            }

        }

        for (Integer integer : input) {
            System.out.print(integer);
        }
    }
}
