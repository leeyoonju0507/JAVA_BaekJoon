package javaStudy0710;

import java.util.Scanner;

public class PlusDevide {

	public static void printPlusDevide(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(b>c) {
			System.out.println(a*b/c);
		}else {
			System.out.println(a*c/b);
		}
	}

}
