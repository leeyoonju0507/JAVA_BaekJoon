package javaStudy0703;

import java.util.Scanner;

public class HanHwa {

	public static void printHanHwa(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		System.out.println(c/b+" "+c%b);
	}

}
