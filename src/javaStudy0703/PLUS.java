package javaStudy0703;

import java.util.Scanner;

public class PLUS {

	public static void printPLUS(String[] args) {
		long sum=0;
		long a,b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextLong();
		b = scan.nextLong();
		sum=a+b;
		System.out.println(sum);
		scan.close();
	}

}
