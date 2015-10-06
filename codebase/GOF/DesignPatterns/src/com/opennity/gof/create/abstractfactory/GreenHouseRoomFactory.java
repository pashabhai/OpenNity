package com.opennity.gof.create.abstractfactory;

public class GreenHouseRoomFactory extends RoomAbstractFactory {

	@Override
	public Wall makeWall() {

		return new GlassWall();
	}

	@Override
	public Floor makeFloor() {

		return new WoodFloor();
	}

	@Override
	public Ceiling makeCeiling() {

		return new GlassCeiling();
	}

}
