package javaStudy0710;

import java.util.Scanner;

public class COW {

	public static void printCOW(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		b = b/d;
		c = c/d;
		
		if(b*c<=a) {
			System.out.println(b*c);
		}else {
			System.out.println(a);
		}
	}

}
