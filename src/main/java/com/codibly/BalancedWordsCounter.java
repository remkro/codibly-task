package com.codibly;

import java.util.Collection;
import java.util.HashMap;

public class BalancedWordsCounter {
    public Integer count(String input) {
        if (input == null)
            throw new RuntimeException("Input cannot be null!");
        if (!checkIfWordContainsLettersOnly(input))
            throw new RuntimeException("Input must consists of letters only!");
        return countBalancedWords(input);
    }

    private boolean checkIfWordContainsLettersOnly(String input) {
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c))
                return false;
        }
        return true;
    }

    private boolean checkIfWordIsBalanced(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = input.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Collection<Integer> values = charCountMap.values();
        return values.stream().distinct().count() <= 1;
    }

    private int countBalancedWords(String input) {
        int balancedWords = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (checkIfWordIsBalanced(input.substring(i, j)))
                    balancedWords++;
            }
        }
        return balancedWords;
    }
}
