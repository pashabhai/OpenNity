package com.opennity.gof.create.factorymethod;

public class Test {

	public static void main(String[] args) {

		HouseCreator hc = new BungalowCreator();
		House house = hc.createHouse();
		System.out.println("house is a  "+house.getType());
		System.out.println("house has a "+house.getSecurity());

	}

}
