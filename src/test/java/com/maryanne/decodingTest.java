package com.maryanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class decodingTest {

    @Test
    void decodingUserInput() {

        decoding decode = new decoding();
        assertEquals("hi", decode.decoding("jk", 2));
    }
}