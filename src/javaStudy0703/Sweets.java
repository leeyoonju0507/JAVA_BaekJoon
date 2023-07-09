package javaStudy0703;

import java.util.Scanner;

public class Sweets {

	public static void printSweets(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d,e,f;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		e=scan.nextInt();
		f=scan.nextInt();
		
		System.out.printf("%d %d %d",d-c,e/b,f-a);
	}

}
