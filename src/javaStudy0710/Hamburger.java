package javaStudy0710;

import java.util.Scanner;

public class Hamburger {

	public static void printHamburger(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a%2==1) {
			a = a -1;
		}
		
		if(2*b<=a) {
			System.out.println(b);
		}else{
			System.out.println(a/2);
		}

	}

}
