package com.opennity.gof.create.factorymethod;

public class Bungalow extends House {

	@Override
	public Security getSecurity() {
		return new BungalowSecurity();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Bungalow";
	}

}
