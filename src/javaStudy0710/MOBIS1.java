package javaStudy0710;

import java.util.Scanner;

public class MOBIS1 {

	public static void main(String[] args) {
		char[] MB = {'M','O','B','I','S'};
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int cnt = 0;

		for(char A:MB)
		{
			for(int j=0;j<str.length();j++) {
				if(A==str.charAt(j)) {
					cnt+=1;
					break;
				}
			}
		}

		if(cnt==5) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	
	}

}
