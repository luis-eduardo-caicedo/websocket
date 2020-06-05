package com.websocket.model;

public class Metoreologia {

	private String cDateUTC;

	public Metoreologia() {
		super();
	}

	public Metoreologia(String cDateUTC) {
		super();
		this.cDateUTC = cDateUTC;
	}

	public String getcDateUTC() {
		return cDateUTC;
	}

	public void setcDateUTC(String cDateUTC) {
		this.cDateUTC = cDateUTC;
	}

	@Override
	public String toString() {
		return "Metoreologia [cDateUTC=" + cDateUTC + "]";
	}

}
