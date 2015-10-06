package com.opennity.gof.create.abstractfactory;

public class Test {

	public static void main(String[] args) {

		RoomAbstractFactory roomFactory = new GreenHouseRoomFactory();
		Wall wall = roomFactory.makeWall();
		Ceiling ceiling = roomFactory.makeCeiling();
		Floor floor = roomFactory.makeFloor();

		System.out.println("type of wall"+wall.getType());
		System.out.println("type of ceiling"+ceiling.getType());
		System.out.println("type of floor"+floor.getType());

	}
}
