package javaStudy0710;

import java.util.Scanner;

public class Alphabet {

	public static void printAlphabet(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int[] num = new int[26];
		
		for(int i=0;i<str.length();i++) {
			num[(int)str.charAt(i)-97]+=1;
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
