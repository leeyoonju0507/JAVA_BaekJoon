package javaStudy0710;

import java.util.Scanner;

public class FishBread {

	public static void printFishBread(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] arr = new int[a*b];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[b*i+j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<a;i++) {
			for(int j=b*i+b-1;j>=b*i;j--) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}

}
