package javaStudy0703;

import java.math.BigInteger;
import java.util.Scanner;

public class BigAB {

	public static void printBigAB(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String a = str.split(" ")[0];
		String b = str.split(" ")[1];
		
		BigInteger anum = new BigInteger(a);
		BigInteger bnum = new BigInteger(b);
		BigInteger sum = new BigInteger("1");
		sum=sum.multiply(anum);
		sum=sum.multiply(bnum);
		System.out.println(sum);
	}

}
