package javaStudy0710;

import java.util.Scanner;

public class ABPLUS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
		if(a.length()==4) {
			System.out.println(20);
		}
		else if(a.charAt(1)=='0' && a.length()==3) {
			System.out.println((int)a.charAt(2)-48+10);
			
		}
		else if(a.charAt(2)=='0' && a.length()==3) {
			System.out.println((int)a.charAt(0)+10-48);
			
		}else {
			System.out.println((int)a.charAt(0)+(int)a.charAt(1)-96);
			
		}
		
		
	}

}
