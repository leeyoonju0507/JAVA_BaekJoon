package javaStudy0710;

import java.util.Scanner;

public class NumberSum {

	public static void printNumberSum(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String str = scan.next();
		int sum = 0;
		
		for(int i=0;i<str.length();i++)
		{
			sum+=(int)str.charAt(i)-48;
		}
		
		System.out.println(sum);
	}

}
