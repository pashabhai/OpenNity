package com.opennity.java7.exception;

/**
 * method rethrowException need not declare throws Exception
 * even though Exception is thrown at line 31, the java 7 checks the actual type of exception throws
 * and ensure it is mentioned in the list of throws clause
 * @author prashant.purkar
 *
 */
public class Rethrow {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		rethrowException("First");

	}

	public static void rethrowException(String exceptionName) throws FirstException,SecondException {
		try {
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		}
		catch (FirstException  |SecondException e) {
			throw e;
		}
		catch (Exception e) {
			throw e;
		}
	}

}