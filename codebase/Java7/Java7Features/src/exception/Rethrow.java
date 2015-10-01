package exception;

import java.io.IOException;
import java.sql.SQLException;

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