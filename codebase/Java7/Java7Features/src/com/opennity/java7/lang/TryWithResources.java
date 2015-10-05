package com.opennity.java7.lang;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Resources are automatically closed declared inside try block, resource should implement
 * java.io.Closeble or java.lang.Autocloseble
 * Explicot Finally block is not required
 * @author prashant.purkar
 *
 */
public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String readFirstLineFromFile(String path) throws IOException {
		  try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		    return br.readLine();
		  }
		}

}
