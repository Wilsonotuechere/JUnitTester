package org.example;


import org.junit.jupiter.api.Test;

import static org.example.Privatenumber.isPrivatenumber;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrivatenumberTest {

    @Test
    public void testisPrivatenumber() {
        assertEquals(true,Privatenumber.isPrivatenumber(-100));
        assertEquals(true,Privatenumber.isPrivatenumber(-10));
        assertEquals(true,Privatenumber.isPrivatenumber(-1));
        assertEquals(false,Privatenumber.isPrivatenumber(1));
        assertEquals(false,Privatenumber.isPrivatenumber(10));
        assertEquals(false,Privatenumber.isPrivatenumber(10));
    }
}