package com.opennity.gof.bhv.Startergy;



public class Situation {

	private Mind mind;
	private String situationData;



	public Situation(Mind mn){

		this.mind = mn;
	}


	public void handle(){

		System.out.println("handling situation using "+ mind.response(situationData));


	}



}
