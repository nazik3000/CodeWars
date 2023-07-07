package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.Assert.*;


public class TestClass {
    //Good VS Evil block 3 tests
    @Test
    public void testEvilWin() {
        assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("1044 8348 544 3227 2694 6932", "350 1867 6023 8513 214 4287 3844"));
    }

    @Test
    public void testGoodWin() {
        assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    @Test
    public void testTie() {
        assertEquals("Should be a tie", "Battle Result: No victor on this battle field",
                GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }
    @Test
    public void testSol2() {
        assertEquals(1.0, Sol2.findUniq(new double[]{0, 1, 0}),0.0000000001);
        assertEquals(2.0, Sol2.findUniq(new double[]{1, 1, 1, 2, 1, 1}), 0.0000000001);
    }
   @Test
    public void testSol5() {
       int[] nums = {2, 4, 0, 100, 4, 11, 2602, 36};
       assertEquals(11, Sol5.find(nums));
    }

    @Test
    public void Test11() {
        assertEquals(true, Sol11.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertEquals(false, Sol11.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    }

    @Test
    public void testSol10() {
        assertEquals(true, Sol10.isIsogram("Dermatoglyphics"));
        assertEquals(true, Sol10.isIsogram("isogram"));
        assertEquals(false, Sol10.isIsogram("moose"));
    }

    @Test
    public void testSol8() {
        assertEquals(144, Sol8.findNextSquare(121));
    }

    @Test
    public void testSol7v1() {
        assertEquals("TTTT", Sol7.makeComplement("AAAA"));
    }

    @Test
    public void testSol7v2() {
        assertEquals("TAACG", Sol7.makeComplement("ATTGC"));
    }

    @Test
    public void testSol7v3() {
        assertEquals("CATA", Sol7.makeComplement("GTAT"));
    }

    @Test
    public void test() {
        assertEquals(811181, new Sol4().squareDigits(9119));
        assertEquals(0, new Sol4().squareDigits(0));
    }

    @Test
    public void testSol3() {

        String expected = "Hll, 'm Nzr";
        assertEquals(expected, Sol3.disemvowel("Hello, I'm Nazar"));
    }

    @Test
    public void testSol1() {
        assertEquals(23, new Sol1().solution(10));
    }

    @Test
    public void testSol15() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals( "[ab, cd, ef]", Arrays.toString(Sol15.solution(s)));
        assertEquals( "[He, ll, oW, or, ld]", Arrays.toString(Sol15.solution(s1)));
    }

    @Test
    public void tesSol15v2() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals( "[ab, cd, e_]", Arrays.toString(Sol15.solution(s)));
        assertEquals( "[Lo, ve, Pi, zz, a_]", Arrays.toString(Sol15.solution(s1)));
    }

    @Test
    @DisplayName("Valid input")
    public void testValidInput() {
        assertTrue(NotVerySecure.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    @DisplayName("Invalid character")
    @ParameterizedTest(name = "Should return false for \"{0}\"")
    @ValueSource(strings = {"", "with space", "with_underscore", "punctuation.", "naïve", "１strangedigit", "emoji😊"})
    void testInvalidChars(String input) {
        assertFalse(NotVerySecure.alphanumeric(input));
    }
}

