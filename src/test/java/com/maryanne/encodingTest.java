package com.maryanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class encodingTest {

    encoding encodingTest = new encoding("Maryanne", 2);
    @Test
    void encodingUserInput(){
        assertEquals("octacppg",  encodingTest.encoding());

    }

}