package javaStudy0703;

import java.util.Scanner;

public class Rats {

	public static void printRats(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,sum;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		sum = (a+1)*(b+1)/(c+1)-1;
		System.out.println(sum);
	}

}
