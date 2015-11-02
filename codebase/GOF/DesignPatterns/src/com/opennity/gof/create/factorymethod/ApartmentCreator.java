package com.opennity.gof.create.factorymethod;

public class ApartmentCreator extends HouseCreator {

	@Override
	public House createHouse() {

		return new Apartment();
	}

}
