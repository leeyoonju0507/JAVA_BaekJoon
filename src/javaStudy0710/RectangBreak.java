package javaStudy0710;

import java.util.Scanner;

public class RectangBreak {

	public static void printRectangBreak(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int r1 = a;
		int r2 = c-a;
		int h1 = b;
		int h2 = d-b;
		
		int min = Math.min(r1, r2);
		min = Math.min(min, h1);
		min = Math.min(min, h2);
		System.out.println(min);
	}

}
