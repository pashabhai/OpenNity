package com.opennity.java7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * demonstrate generic type <?> and
 * @author Prashant.Purkar
 *
 */
public class Type {

	// array of generics is illegal, below wont compile
	//static List<String> l[] = new ArrayList<String>[2];

	public static void main(String[] args) {


		List<String> strList = new ArrayList<>();
		List<Object> objList = new ArrayList<>();
		List<?> anyList = new ArrayList<>();

		/**
		 * generics are non reifible and use erausre techniques
		 * Reifible is less info at runtime than at compile time.
		 * Error are detected at Compile time
		 */
	//	strList.add(new Object());
		objList.add("can i fit in");
		anyList.add(null); // only null is allowed


		/** arrays are covariant and reifible
			below code throws runtime error and not compile time
		*/

		Object obj[] = new String[2];
	    obj[2] = "this is it, focus!!";
	    System.out.println(obj[1]);

	}
}
