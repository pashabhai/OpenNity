package com.opennity.gof.bhv.decorator;

public class POPBuildingElement implements BuildingElement {

	private BuildingElement buildingElement;


	public POPBuildingElement(BuildingElement buildingElement){

		this.buildingElement = buildingElement;
	}

	@Override
	public void decorate() {

		System.out.println("POP started");
		buildingElement.decorate();
		System.out.println("POP finished");

	}

}
