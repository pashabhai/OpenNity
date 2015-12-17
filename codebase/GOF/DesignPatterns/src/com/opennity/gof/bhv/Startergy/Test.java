package com.opennity.gof.bhv.Startergy;



/**
 * http://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries
 * @author Prashant.Purkar
 *
 */
public class Test {


	public static void main(String[] args) {

	Mind mind = new KnowledgeMind();
	Situation anySituation = new Situation(mind);

	anySituation.handle();

	}

}
