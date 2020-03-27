package com.lamesa.net;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Mitchell
 *	DataGram class will be used to represent a segment of data sent to the server
 */
class DataGram implements Serializable {
	
	private static final long serialVersionUID = 3219628280191397934L;

	private final UUID ID = UUID.randomUUID();
	
	private final Object payload;
	
	/**
	 * @param payload The payload to be sent
	 */
	public DataGram(Object payload) {
		this.payload = payload;
	}
	
	
	/**
	 * Get the UUID of the DataGram
	 * @return UUID
	 */
	public UUID ID() {
		return this.ID;
	}
	
	/**
	 * Get the Payload within the DataGram
	 * @return Payload contained within DataGram
	 */
	public Object getPayload() {
		return this.payload;
	}
	
}
