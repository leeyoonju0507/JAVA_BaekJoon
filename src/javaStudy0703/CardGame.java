package javaStudy0703;

import java.util.Scanner;

public class CardGame {

	public static void printCardGame(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int a;
		a = scan.nextInt();
		sum+=a;
		a = scan.nextInt();
		sum+=a;
		a = scan.nextInt();
		sum+=a;
		a = scan.nextInt();
		sum+=a;
		a = scan.nextInt();
		sum+=a;
		System.out.println(sum);
	}

}
