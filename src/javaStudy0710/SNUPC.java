package javaStudy0710;

import java.util.Scanner;

public class SNUPC {

	public static void printSNUPC(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a<=b) {
			System.out.println(b-a);
		}else {
			System.out.println(a+b);
		}

	}

}
