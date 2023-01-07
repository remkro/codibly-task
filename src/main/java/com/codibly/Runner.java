package com.codibly;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        List<Comparable> input = Arrays.asList(134, null, 37, null, 3);
        List<Comparable> sort = bs.sort(input);
        System.out.println("Bubble sort result: " + sort);

        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        Integer balancedWords = balancedWordsCounter.count("aabbabcccba");
        System.out.println("Balanced word counted: " + balancedWords);
    }
}
