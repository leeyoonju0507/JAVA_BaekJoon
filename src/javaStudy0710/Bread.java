package javaStudy0710;

import java.util.Scanner;

public class Bread {

	public static void printBread(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b,c;
		int min=1001;
		int flag = 0;
		
		for(int i= 0;i<a;i++) {
			b = scan.nextInt();
			c = scan.nextInt();
			if(b<=c) {
				flag = 1;
				if(min>c) {
					min=c;
				}
			}
		}
		
		if(flag==0) {
			System.out.println(-1);
		}else {
			System.out.println(min);
		}
		
	}

}
