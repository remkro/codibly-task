package com.codibly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BalancedWordsCounterTest {
    private final BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    public void shouldProperlyCountBalancedSubwordsInInputWord() {
        String input = "aabbabcccba";
        Integer result = balancedWordsCounter.count(input);
        assertEquals(28, result);
    }

    @Test
    public void shouldReturnZeroBalancedSubwordsInEmptyInputWord() {
        String input = "";
        Integer result = balancedWordsCounter.count(input);
        assertEquals(0, result);
    }

    @Test
    public void shouldThrowRunTimeExceptionWhenInputContainsOtherCharacters() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            balancedWordsCounter.count("abababa1");
        });
        assertEquals("Input must consists of letters only!", thrown.getMessage());
    }

    @Test
    public void shouldThrowRunTimeExceptionWhenInputIsNull() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            balancedWordsCounter.count(null);
        });
        assertEquals("Input cannot be null!", thrown.getMessage());
    }
}