package javaStudy0710;

import java.util.ArrayList;
import java.util.Scanner;

public class Chicken2 {

	public static void printChicken2(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			arr.add(scan.nextInt());
			if(arr.get(i)<a) {
				sum+=arr.get(i);
			}else {
				sum+=a;
			}
		}
		System.out.println(sum);
	}

}
