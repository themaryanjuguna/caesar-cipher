package com.maryanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class decodingTest {

    decoding decodingTest = new decoding("octacppg", 2);

    @Test
    void decodingUserInput() {
        assertEquals("maryanne", decodingTest.decoding());
    }
}