package javaStudy0710;

import java.util.Scanner;

public class MatKor {

	public static void printMatKor(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		if(b==1 || !(a>=12 && a<=16)) {
			System.out.println(280);
		}else {
			System.out.println(320);
		}

	}

}
