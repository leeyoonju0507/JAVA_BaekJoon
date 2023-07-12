package javaStudy0710;

import java.util.Scanner;

public class AEIOU {

	public static void printAEIOU(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		String aa = "aeiouAEIOU";
		int num;
		
		while(true) {
			num = 0;
			str = scan.nextLine();
			if(str.equals("#")) {
				break;
			}	
			
			for(int i=0;i<str.length();i++) {
				if(aa.contains(String.valueOf(str.charAt(i)))) {
					num+=1;
				}
			}
			System.out.println(num);
		}
	}

}
