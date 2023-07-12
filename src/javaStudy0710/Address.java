package javaStudy0710;

import java.util.Scanner;

public class Address {

	public static void printAddress(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		int sum;
		while(true) {
			sum = 0;
			str = scan.next();
			if(str.equals("0")) {
				break;
			}
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='1') {
					sum+=2;
				}else if(str.charAt(i)=='2') {
					sum+=3;
				}else if(str.charAt(i)=='0') {
					sum+=4;
				}else {
					sum+=3;
				}
				
			}
			System.out.println(sum+2+(str.length()-1)*1);
		}

	}
}
