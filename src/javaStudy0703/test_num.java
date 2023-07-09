package javaStudy0703;

import java.util.Scanner;

public class test_num {

	public static void printtest_num (String[] args) {
		int sum=0;
		int a,b,c,d,e;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		sum = (a*a+b*b+c*c+d*d+e*e)%10;
		System.out.println(sum);
	}
}
