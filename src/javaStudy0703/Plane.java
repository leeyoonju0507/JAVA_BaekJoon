package javaStudy0703;

import java.util.Scanner;

public class Plane {

	public static void printPlane(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println(a*b+c*d);

	}

}
