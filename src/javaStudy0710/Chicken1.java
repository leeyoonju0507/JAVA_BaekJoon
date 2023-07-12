package javaStudy0710;

import java.util.Scanner;

public class Chicken1 {

	public static void printChicken1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		int[] arr = new int[3];
		for(int i = 0; i<3 ;i++) {
			arr[i] = scan.nextInt();
			if(arr[i]<a)
			{
				sum+=arr[i];
			}else {
				sum+=a;
			}
		}

		System.out.println(sum);		
	}

}
