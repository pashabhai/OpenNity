package com.opennity.java7.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Generic type information is given priority over raw type inheritance hierarchy
 * @author Prashant.Purkar
 *
 */
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance.Test t = new Inheritance.Test();
		Inheritance.AB ab = new Inheritance.AB();

		t.test(ab);

	}


	interface A { List<Number>  getList(); }
	interface B { List getList(); }
	interface ABInterface extends A, B {}

	static class AB implements ABInterface{

		public List getList(){
			return Arrays.asList("aa","ll");
		}
	}


	static class Test {
	    void test(ABInterface ab) {
	        Number n = ab.getList().get(0); //error here
	        System.out.println("final output "+n);
	    }
	}
}
