

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2440 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = br.read();
		System.out.println(in);
		for(int i=0;i<in;i++) {
			for(int j=0;j<in-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	

}
