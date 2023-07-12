

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2440 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = br.read();
		/**
		 * 23.07.12
		 * read 메서드에서 엔터키를 입력으로 인식해서 생기는 문제입니다.
		 * 아무것도 입력하지 않은 상태에서 엔터만 입력하면 13이 입력하는 걸 볼 수 있어요.
		 * 13은 엔터키의 코드값입니다.
		 * 이 경우 br.readLine();을 써서 int로 형변환 할 필요가 있겠네요!
		 * int in = Integer.parseInt(br.readLine());을 사용해보세요!
		 * */ 
		
		System.out.println(in);
		for(int i=0;i<in;i++) {
			for(int j=0;j<in-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	

}
