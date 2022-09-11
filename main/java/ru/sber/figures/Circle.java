package ru.sber.figures;

import ru.sber.Figure;

public class Circle implements Figure {
    public static class InvalidConstructorParameterException extends Exception {
        public InvalidConstructorParameterException(String errorMessage) {
            super(errorMessage);
        }
    }
    static final double pi = 3.1415;
    double radius;

    private void validateConstructorParams(double radius) throws InvalidConstructorParameterException {
        if (radius < 0) {
            throw new InvalidConstructorParameterException("radius cannot be less than 0");
        }
    }

    public Circle(double radius) throws InvalidConstructorParameterException {
        validateConstructorParams(radius);
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * this.radius * this.radius;
    }
}
