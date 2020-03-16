package com.lamesa.net;

import java.io.Serializable;

public enum ReqType implements Serializable {
	
	RESTAURANT_LIST(1), NAME(2), MENU(3), SCHEMA(4), TBL_SCHEMA(5);
	
	private final int id;
	
	private ReqType(int id) {
		this.id = id;
	}
	
	public int ID() {
		return this.id;
	}
	
}
