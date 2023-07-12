package javaStudy0710;

import java.util.Scanner;

public class Game {

	public static void printGame(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a, b, c;
		int x = 0;
		int max = 0;
		
		
		for(int i=0;i<n;i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			
			if(a!=b && a!=c && b!=c) {
				x = Math.max(a, b);
				x = Math.max(x, c);
				x = x * 100;
				
			}else if(a==b && b==c && a==c) {
				x = 10000 + a*1000;
				
			}else {
				if(a==b) {
					x = 1000 + 100*a;
				}else if(a==c) {
					x = 1000 + 100*a;
				}else if(b==c) {
					x = 1000 + 100*b;
				}
			}
			if(max<x) {
				max = x;
			}
		}
		System.out.println(max);

	}

}
