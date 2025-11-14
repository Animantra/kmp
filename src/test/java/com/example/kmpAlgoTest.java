package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class kmpAlgoTest{

    private kmpAlgo kmp;

    @BeforeEach
    public void setUp() {
        kmp = new kmpAlgo();
    }

    @Test
    public void testShortText() {
        String text = "ABABABC";
        String pattern = "ABAB";

        List<Integer> expected = List.of(0, 2);
        List<Integer> result = kmp.kmpAlgo(pattern, text);

        assertEquals(expected, result);
    }

    @Test
    public void testMediumString() {
        String text = "AABACAADAABAAABAAABACAAABA";
        String pattern = "AABA";

        List<Integer> expected = List.of(0, 8, 12, 16, 22);
        List<Integer> result = kmp.kmpAlgo(pattern, text);

        assertEquals(expected, result);
    }

    @Test
    public void testLongString() {
        String text = "AABACAADAABAAABAAABACAAABAAABACAAABAAABAC";
        String pattern = "AAABAC";

        List<Integer> expected = List.of(15, 25, 35);
        List<Integer> result = kmp.kmpAlgo(pattern, text);

        assertEquals(expected, result);
    }
}
