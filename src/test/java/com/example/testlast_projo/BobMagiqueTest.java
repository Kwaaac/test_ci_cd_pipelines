package com.example.testlast_projo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BobMagiqueTest {

    @Test
    public void testQuaranteDeux() {
        assertEquals(42, BobMagique.getQuaranteDeux());
    }

}