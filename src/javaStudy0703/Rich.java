package javaStudy0703;

import java.math.BigInteger;
import java.util.Scanner;

public class Rich {

	public static void printRich (String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String a = str.split(" ")[0];
		String b = str.split(" ")[1];
		
		BigInteger aa = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		System.out.println(aa.divide(bb));
		System.out.println(aa.mod(bb));
	}

}
