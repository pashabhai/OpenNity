package readabiity;

public class ByteLiteral {

	static int two = 0B11111111;
	static int anInt1 = 0b1111111_11111111_11111111_11111111;
	static int maxInt = 2_147_483_647;
	static long ssn = 313_31_7334L;
	static long large_number = 1234567890;
	static long maxlong = 9_223_372_036_854_775_807l;
	static byte buf[] = { 0b00100001,0b00100001};
	static byte integraltype = (byte) 0B11_11_0001;

	static String spanish = "S\u00ED Se\u00F1or";
    static String a = "\u0108";

	int anInt2 = 0b101;
	int anInt3 = 0B101;
	float pi = 	3.14_15F;

	long creditCardNumber = 1234_5678_9012_3456L;
	long socialSecurityNumber = 999_99_9999L;

	long hexBytes = 0xFF_EC_DE_5E;
	long hexWords = 0xCAFE_BABE;
	long maxLong = 0x7fff_ffff_ffff_ffffL;
	byte nybbles = 0b0010_0101;
	long bytes = 0b11010010_01101001_10010100_10010010;


	//int x1 = _52;              // This is an identifier, not a numeric literal
	int x2 = 5_2;              // OK (decimal literal)
	//int x3 = 52_;              // Invalid; cannot put underscores at the end of a literal
	int x4 = 5_______2;

	public static void main(String[] args) {

		System.out.println("two "+two);
		System.out.println("ssn "+ssn);
		System.out.println("large_number "+large_number);
		System.out.println("integraltype "+integraltype);
		System.out.println(spanish);
		System.out.println(a);

	}



}
