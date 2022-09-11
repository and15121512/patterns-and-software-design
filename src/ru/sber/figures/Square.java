package ru.sber.figures;

import ru.sber.Figure;

public class Square implements Figure {
    public static class InvalidConstructorParameterException extends Exception {
        public InvalidConstructorParameterException(String errorMessage) {
            super(errorMessage);
        }
    }

    double side;

    private void validateConstructorParams(double side) throws InvalidConstructorParameterException {
        if (side < 0) {
            throw new InvalidConstructorParameterException("side cannot be less than 0");
        }
    }

    public Square(double side) throws InvalidConstructorParameterException {
        validateConstructorParams(side);
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side;
    }
}
