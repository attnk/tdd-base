package com.tdd.base.exceptions;

public class WordDataRepositoryException extends Exception{

	private static final long serialVersionUID = 1476168147574737633L;
	
	public WordDataRepositoryException() {
		super();
	}

	public WordDataRepositoryException(Throwable cause) {
		super(cause);
	}
	
	public WordDataRepositoryException(String message) {
		super(message);
	}
	
	public WordDataRepositoryException(String message, Throwable cause) {
		super(message, cause);
	}
}
