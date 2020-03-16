package com.lamesa.net;

import java.io.Serializable;
import java.util.UUID;

class Request implements Serializable {
	
	private static final long serialVersionUID = 8013958162573431213L;
	
	private final transient UUID id;
	
	private final ReqType REQ;
	private final Object obj;
	
	public Request(ReqType REQ, Object obj) {
		this.REQ = REQ;
		this.obj = obj;
		this.id = UUID.randomUUID();
	}
	
	public ReqType getReqType() {
		return this.REQ;
	}
	
	public Object getObject() {
		return this.obj;
	}
	
	public UUID getID() {
		return this.id;
	}
	
}
