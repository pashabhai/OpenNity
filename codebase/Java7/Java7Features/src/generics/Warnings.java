package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Warning are shown for violation of generic type safety.
 * @author Prashant.Purkar
 *
 */

public class Warnings {

	public static void main(String[] args) {


		List l = new ArrayList<Number>();
	    List<String> ls = l;       // unchecked warning
	    l.add(0, new Integer(42)); // another unchecked warning
	    String s = ls.get(0);
	}

}
