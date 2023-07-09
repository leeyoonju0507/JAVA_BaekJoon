package javaStudy0703;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNum {

	public static void printBigNum (String[] args) {
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
