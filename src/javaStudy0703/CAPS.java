package javaStudy0703;

import java.util.Scanner;

public class CAPS {

	public static void printCAPS(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print((char)(str.charAt(i)-32));
		}
	}

}
