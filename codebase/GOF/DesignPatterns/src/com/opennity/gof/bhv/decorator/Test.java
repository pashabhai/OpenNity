package com.opennity.gof.bhv.decorator;

public class Test {

	public static void main(String[] args) {

		Wall wall = new Wall();
		ColorBuildingElement color = new ColorBuildingElement(wall);
		POPBuildingElement pop = new POPBuildingElement(color);
		pop.use();
	}

}
