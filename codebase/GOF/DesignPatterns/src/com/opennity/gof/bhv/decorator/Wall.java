package com.opennity.gof.bhv.decorator;

public class Wall implements BuildingElement {

	@Override
	public void decorate() {
		System.out.println("using wall");
	}


}
