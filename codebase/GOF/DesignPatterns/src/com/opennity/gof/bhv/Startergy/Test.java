package com.opennity.gof.bhv.Startergy;

import java.util.ArrayList;
import java.util.List;

/**
 * http://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries
 * @author Prashant.Purkar
 *
 */
public class Test {

	List<String> str = new ArrayList<String>();

	public static void main(String[] args) {

    new Situation(new KnowledgeMind()).handle();

	}

}
