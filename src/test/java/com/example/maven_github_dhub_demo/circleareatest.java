package com.example.maven_github_dhub_demo;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class circleareatest {

    @Test
    void testAreaForRadius5() {
        assertEquals(78.5398,
            circlearea.calculateArea(5), 0.001);
    }

    @Test
    void testAreaForRadius3() {
        assertEquals(28.2743,
            circlearea.calculateArea(3), 0.001);
    }

    @Test
    void testAreaForRadius0() {
        assertEquals(0,
            circlearea.calculateArea(0), 0.001);
    }

    @Test
    void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
            () -> circlearea.calculateArea(-2));
    }
}
