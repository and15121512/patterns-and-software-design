package ru.sber.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void test_ConstructorSideGreaterThanZero() {
        assertDoesNotThrow(()-> {
            Square square = new Square(1.1); }
        );
    }

    @Test
    void test_ConstructorSideEqualsToZero() {
        assertDoesNotThrow(()-> {
            Square square = new Square(0.0); }
        );
    }

    @Test
    void test_ConstructorSideLessThanZero() {
        assertThrows(Square.InvalidConstructorParameterException.class, ()-> {
            Square square = new Square(-0.1); }
        );
    }

    @Test
    void test_calculateArea() {
        Square square = null;
        try {
            square = new Square(3.2);
        } catch(Exception ignore) { }
        assertEquals(square.calculateArea(), 10.24, 0.01);
    }
}
