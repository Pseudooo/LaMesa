package com.lamesa.net;

public interface Response {
	
	/**
	 * Accept the given payload from the handler
	 * @param obj
	 */
	void takePayload(Object obj);
	
	/**
	 * Run the response with the given payload
	 */
	void run();
}
