package com.mrp.exception;

public class ResourceAlreadyExistException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceAlreadyExistException(String msg) {
		super(msg);
	}

}
