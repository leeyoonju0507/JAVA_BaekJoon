package javaStudy0703;

import java.util.Scanner;

public class String_Print {

	public static void printString_Print(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int a = scan.nextInt();
		
		System.out.println(str.charAt(a-1));

	}

}
