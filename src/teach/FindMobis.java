package teach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMobis {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] mobis = {"M", "O", "B", "I", "S"};
		int count = 0;
		
		for(String contains : mobis) {
			if(str.contains(contains)) {
				count++;
			}
		}
		
		if(count == 5) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
