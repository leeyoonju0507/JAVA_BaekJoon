package javaStudy0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ABPLUS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();

		if (a.length() == 4) {
			System.out.println(20);
		} else if (a.charAt(1) == '0' && a.length() == 3) {
			System.out.println((int) a.charAt(2) - 48 + 10);

		} else if (a.charAt(2) == '0' && a.length() == 3) {
			System.out.println((int) a.charAt(0) + 10 - 48);

		} else {
			System.out.println((int) a.charAt(0) + (int) a.charAt(1) - 96);

		}

	}
	
	// 쌤 풀이
	public void teacher() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		if("1010".equals(in)) {
			System.out.println(20);
		}else if(in.contains("10")) {
			in = in.replace("10","");
			System.out.println(Integer.parseInt(in) + 10);
		}else {
			int a = Integer.parseInt(in);
			System.out.println((a/10)+(a%10));			
		}
	}
}

	

