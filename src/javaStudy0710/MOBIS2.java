package javaStudy0710;

import java.util.Scanner;

public class MOBIS2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(str.contains("M")&&str.contains("O")&&str.contains("B")&&str.contains("I")&&str.contains("S"))
		{
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
