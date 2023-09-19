package teach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Sign {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			int n = Integer.parseInt(br.readLine());
			BigInteger s = new BigInteger("0"); 
			
			for(int j=0; j<n; j++) {
				BigInteger line = new BigInteger(br.readLine());
				s = s.add(line);
			}

			if(s.signum() == 0) {
				System.out.println("0");
			}else if(s.signum() > 0) {
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}
	}

}
