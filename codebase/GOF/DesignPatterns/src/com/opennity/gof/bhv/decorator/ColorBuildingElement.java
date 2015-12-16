package com.opennity.gof.bhv.decorator;

public class ColorBuildingElement implements BuildingElement {

	private BuildingElement buildingElement;
	public ColorBuildingElement(BuildingElement building){
		this.buildingElement = building;

	}

	@Override
	public void use() {

		System.out.println("coloring started");
		buildingElement.use();
		System.out.println("coloring finished");
	}

}
