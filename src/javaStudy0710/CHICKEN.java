package javaStudy0710;

import java.util.Scanner;

public class CHICKEN {

	public static void printCHICKEN(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = 0;
		sum = b/2 + c;
		if(sum<=a) {
			System.out.println(sum);
		}else {
			System.out.println(a);
		}
	}

}
