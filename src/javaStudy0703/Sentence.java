package javaStudy0703;

import java.util.Scanner;

public class Sentence {

	public static void printSentence(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		String str2 = "";
		
		while(true)
		{
			str = scan.nextLine();
			if (str=="\n") {
				break;
			}
			System.out.println(str);
			
			
		}
	}

}
