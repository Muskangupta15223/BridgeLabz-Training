package com.collections.dealtracker;

public class InvalidDealException extends Exception {
  	private static final long serialVersionUID = 1L;

	public InvalidDealException(String message) {
        super(message);
    }
}
