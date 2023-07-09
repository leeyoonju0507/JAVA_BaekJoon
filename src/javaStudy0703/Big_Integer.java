package javaStudy0703;

import java.math.BigInteger;
import java.util.Scanner;


public class Big_Integer {

	public static void printBig_Integer (String[] args) {
//		Scanner scan = new Scanner(System.in);
//		BigInteger a = new BigInteger("0");
//		BigInteger b = new BigInteger("0");
//		BigInteger sum = new BigInteger("0");
//		
//		a = scan.nextBigInteger();
//		b = scan.nextBigInteger();
//		sum = sum.add(a);
//		sum = sum.add(b);
//		System.out.println(sum);
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String a = str.split(" ")[0];
		String b = str.split(" ")[1];
		
		BigInteger aa = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		BigInteger sum = new BigInteger("0");
		
		sum = sum.add(aa);
		sum = sum.add(bb);
		System.out.println(sum);
	}

}
