package javaStudy0703;

import java.util.Scanner;

public class ASCII {

	public static void printASCII(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		
		if ((int)c>=65 && (int)c<=90)
		{
			System.out.println((int)c);
		}
		else if((int)c>=97 && (int)c<=122)
		{
			System.out.println((int)c);
		}
		else if((int)c>=48 && (int)c<=57)
		{
			System.out.println((int)c);
		}
	}

}
