package javaStudy0703;

import java.util.Scanner;

public class Fan {

	public static void printFan(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(":fan::fan::fan:");
		System.out.println(":fan::"+ str +"::fan:");
		System.out.println(":fan::fan::fan:");
	}

}
