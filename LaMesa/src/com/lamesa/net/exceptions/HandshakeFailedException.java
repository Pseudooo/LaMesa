package com.lamesa.net.exceptions;

public class HandshakeFailedException extends Exception {
	private static final long serialVersionUID = -9041337088906020415L;
	
	public HandshakeFailedException(String msg) {
		super(msg);
	}
	
}
