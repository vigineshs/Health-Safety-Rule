package com.rule.safety.exception;

public class DisplayException extends Exception {
	
	public DisplayException(String message) {
        super(message);
    }

    public DisplayException(String message, Throwable cause) {
        super(message, cause);
    }
}
