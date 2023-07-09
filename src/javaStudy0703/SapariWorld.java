package javaStudy0703;

import java.math.BigInteger;
import java.util.Scanner;

public class SapariWorld {
	
	public static void printSapariWorld(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		if(a<0)
		{
			a = -a;
		}
		if(b<0)
		{
			b = -b;
		}
		
		BigInteger aa = new BigInteger("0");
		aa = BigInteger.valueOf(a);
		BigInteger bb = new BigInteger("0");
		bb = BigInteger.valueOf(b);
		System.out.println(aa.add(bb));
	}
}
