package com.lamesa.net;

import java.io.Serializable;
import java.util.UUID;

class DataGram implements Serializable {
	
	private static final long serialVersionUID = 3219628280191397934L;

	private final UUID ID = UUID.randomUUID();
	
	private final Object payload;
	
	public DataGram(Object payload) {
		this.payload = payload;
	}
	
	public UUID ID() {
		return this.ID;
	}
	
	public Object getPayload() {
		return this.payload;
	}
	
}
