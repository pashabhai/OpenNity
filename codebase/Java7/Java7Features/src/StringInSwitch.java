

public class StringInSwitch {



	public static void main(String[] args) {

		int million= 10_000_000;
		byte binary_literal = 0b000100001;

		System.out.println("miilion "+million);
		System.out.println("bliteral "+binary_literal);

		//System.out.println(getTypeOfDayWithSwitchStatement("Sunday"));
		String s ="Sunday";
		String s1= "Sunday";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}


	public static String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
	     String typeOfDay;
	     System.out.println(dayOfWeekArg.hashCode());
	     switch (dayOfWeekArg) {
	         case "Monday":
	             typeOfDay = "Start of work week";
	             break;
	       /**  case "Tuesday":
	         case "Wednesday":
	         case "Thursday":
	             typeOfDay = "Midweek";
	             break;
	         case "Friday":
	             typeOfDay = "End of work week";
	             break;
	         case "Saturday":
	       */  case "Sunday":
	             typeOfDay = "Weekend";
	             break;
	         default:
	             throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
	     }
	     return typeOfDay;

	}

}
