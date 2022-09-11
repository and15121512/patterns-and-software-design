package ru.sber.figures;

import ru.sber.Figure;

public class Rectangle implements Figure {
    public static class InvalidConstructorParameterException extends Exception {
        public InvalidConstructorParameterException(String errorMessage) {
            super(errorMessage);
        }
    }

    double width;
    double height;

    private void validateConstructorParams(double width, double height) throws InvalidConstructorParameterException {
        if (width < 0 || height < 0) {
            throw new InvalidConstructorParameterException("width and height cannot be less than 0");
        }
    }

    public Rectangle(double width, double height) throws InvalidConstructorParameterException {
        validateConstructorParams(width, height);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }
}
