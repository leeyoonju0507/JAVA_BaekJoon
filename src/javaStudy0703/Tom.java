package javaStudy0703;

import java.util.Scanner;

public class Tom {
	public static void printTomn(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.printf("%d %d",b-a,b);

	}

}
