package ru.sber.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void test_ConstructorWidthAndHeightGreaterThanZero() {
        assertDoesNotThrow(()-> {
            Rectangle rectangle = new Rectangle(1.1, 2.2); }
        );
    }

    @Test
    void test_ConstructorWidthLessThanZero() {
        assertThrows(Rectangle.InvalidConstructorParameterException.class, ()-> {
            Rectangle rectangle = new Rectangle(-1.1, 2.2); }
        );
    }

    @Test
    void test_ConstructorHeightLessThanZero() {
        assertThrows(Rectangle.InvalidConstructorParameterException.class, ()-> {
            Rectangle rectangle = new Rectangle(1.1, -2.2); }
        );
    }

    @Test
    void test_calculateArea() {
        Rectangle rectangle = null;
        try {
            rectangle = new Rectangle(1.1, 2.2);
        } catch(Exception ignore) { }
        assertEquals(rectangle.calculateArea(), 2.42, 0.01);
    }
}
