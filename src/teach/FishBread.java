package teach;

import java.util.Scanner;

public class FishBread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String str = "";
		String reverse = "";


		for(int i=0;i<a;i++) {
			reverse = "";
			str = scan.next();
			//역순으로 바꿔서 배열에 집어넣기
			for(int j=b-1;j>=0;j--) {

				reverse = reverse + str.charAt(j);
			}
			System.out.println(reverse);
		}
		scan.close();
	}

}
