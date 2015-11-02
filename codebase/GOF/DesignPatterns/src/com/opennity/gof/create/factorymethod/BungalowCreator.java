package com.opennity.gof.create.factorymethod;

public class BungalowCreator extends HouseCreator {

	@Override
	public House createHouse() {

		return new Bungalow();
	}

}
