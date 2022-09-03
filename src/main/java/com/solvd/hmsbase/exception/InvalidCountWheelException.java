package com.solvd.hmsbase.exception;

public class InvalidCountWheelException extends RuntimeException {

    public InvalidCountWheelException(String message) {
        super(message);
    }

    public InvalidCountWheelException(String message, Throwable cause) {
        super(message, cause);
    }
}
