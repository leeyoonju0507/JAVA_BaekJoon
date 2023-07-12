package javaStudy0710;

import java.util.Scanner;

public class APPLE {

	public static void printAPPLE(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag=0;
		int[] arr = new int[4];
		int[] brr = new int[3];
		for(int i=0;i<4;i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<3;i++) {
			brr[i] = scan.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			if(brr[0]==arr[i]) {
				flag=1;
				System.out.println(i+1);
				break;
			}
		}
		if(flag==0) {
			System.out.println(0);
		}
		
	}

}
