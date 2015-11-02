package com.opennity.gof.create.factorymethod;

public class Apartment extends House {

	@Override
	public Security getSecurity() {

		return new ApartmentSecurity();
	}

	@Override
	public String getType() {
		return "Apartment";
	}

}
