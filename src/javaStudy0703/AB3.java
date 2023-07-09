package javaStudy0703;

import java.math.BigInteger;
import java.util.Scanner;

public class AB3 {
	public static void printAB3(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger aa = new BigInteger("0");
		BigInteger bb = new BigInteger("0");
		aa = scan.nextBigInteger();
		bb = scan.nextBigInteger();
		
		System.out.println(aa.add(bb));
		System.out.println(aa.subtract(bb));
		System.out.println(aa.multiply(bb));
	}
}

