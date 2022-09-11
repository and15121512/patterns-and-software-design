package ru.sber.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    void test_ConstructorRadiusGreaterThanZero() {
        assertDoesNotThrow(()-> {
            Circle circle = new Circle(1.1); }
        );
    }

    @Test
    void test_ConstructorRadiusEqualsToZero() {
        assertDoesNotThrow(()-> {
            Circle circle = new Circle(0.0); }
        );
    }

    @Test
    void test_ConstructorRadiusLessThanZero() {
        assertThrows(Circle.InvalidConstructorParameterException.class, ()-> {
            Circle circle = new Circle(-0.1); }
        );
    }

    @Test
    void test_calculateArea() {
        Circle circle = null;
        try {
            circle = new Circle(3.2);
        } catch(Exception ignore) { }
        assertEquals(circle.calculateArea(), 32.168, 0.01);
    }
}
