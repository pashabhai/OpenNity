package com.opennity.java7.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * In java 7, type inference is introduced eliminating need to mention actual parameter
 * in crating generic type instance.
 *
 * Actual type is inferred from the Generic type declaration.
 * @author Prashant.Purkar
 *
 */
public class TypeInference {

	Map<String,String> mymap1 = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> mymap = new HashMap<>();
		mymap.put("hi","pasha");

		System.out.println(mymap.size());

		List<String> list = new ArrayList<>();
		list.add("A");

		//list.addAll(new ArrayList<>());


	}

}
