package javaStudy0710;

import java.util.Scanner;

public class Phone {

	public static void printPhone(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b;
		int sum_Y = 0;
		int sum_M = 0;
		for(int i =0;i<a;i++)
		{
			b = scan.nextInt();
			sum_Y += (b/30+1)*10;
			sum_M += (b/60+1)*15;
		}
		
		if(sum_Y<sum_M) {
			System.out.println("Y"+" "+sum_Y);
		}else if(sum_Y>sum_M) {
			System.out.println("M"+" "+sum_M);
		}else {
			System.out.println("Y"+" "+"M"+" "+sum_M);
		}

	}

}
