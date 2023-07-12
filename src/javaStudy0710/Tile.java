package javaStudy0710;

import java.util.Scanner;

public class Tile {

	public static void printTile (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		System.out.println(a*b/2);
		

	}

}
