package javaStudy0703;

import java.util.Scanner;

public class Cupcake {

	public static void printCupcake(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a*8+b*3-28);
	}

}
