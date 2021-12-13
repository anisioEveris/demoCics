package com.examplecics.demo.exception;

public class ValidationFieldsException extends Exception{
    /** The serial version UID. */
    public static final long serialVersionUID = 19720926L;

    /**
     * Construtor da classe
     */
    public ValidationFieldsException() {
    }

    /**
     * Construtor da Superclasse
     *
     * @param message
     */
    public ValidationFieldsException(String message) {
        super(message);
    }

    /**
     * Construtor da Superclasse
     *
     * @param message
     * @param exception
     */
    public ValidationFieldsException(String message, Throwable exception) {
        super(message, exception);
    }

    /**
     * Construtor da Superclasse
     *
     * @param e
     */
    public ValidationFieldsException(Exception e) {
        super(e);
    }
}
