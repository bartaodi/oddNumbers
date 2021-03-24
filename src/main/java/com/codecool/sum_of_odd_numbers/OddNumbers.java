package com.codecool.sum_of_odd_numbers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        Integer sumOfOddNum = 0;
        for (Integer i : oddNumbers) {
            sumOfOddNum += i;
        }
        return sumOfOddNum;
    }
}