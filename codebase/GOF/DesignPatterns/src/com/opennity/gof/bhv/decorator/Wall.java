package com.opennity.gof.bhv.decorator;

public class Wall implements BuildingElement {

	@Override
	public void use() {
		System.out.println("using wall");
	}


}
