package javaStudy0710;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MOBIS4 {

	public static void main(String[] args) {
		ArrayList<String> aa = new ArrayList<>();
		aa.add("M");
		aa.add("O");
		aa.add("B");
		aa.add("I");
		aa.add("S");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int cnt = 0;
		
		for(String temp:aa) {
			if(str.contains(temp)) {
				cnt+=1;
			}
		}
		
		if(cnt==5) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
