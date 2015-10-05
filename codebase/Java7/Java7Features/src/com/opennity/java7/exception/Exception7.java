package com.opennity.java7.exception;
/**
 * In Java 7 compiler checks the type of exception that is thrown and gives error if
 * the error being thrown is not caught. To see #uncomment line no 22
 * @author prashant.purkar
 *
 *
 */

public class Exception7 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			   throw new DaughterOfFoo();
			} catch (final Foo exception) {
			   try {
			      throw exception; // used to throw Foo, now throws DaughterOfFoo
			      // the above statemet throws DaughterOfFoo exception and Foo exception
			      // as introduced in java 7 .
		//	   } catch (SonOfFoo anotherException) { // Reachable?
	    	   } catch (DaughterOfFoo anotherException) { // Reachable?
			}

			}
	}
	}


	class Foo extends Exception {}
	class SonOfFoo extends Foo {}
	class DaughterOfFoo extends Foo {}


