package javaStudy0703;

import java.util.Scanner;

public class Minus {

	public static void printMinus(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum,a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		sum = a-b;
		System.out.println(sum);
	}

}
