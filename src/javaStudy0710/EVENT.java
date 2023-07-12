package javaStudy0710;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EVENT {

	public static void printEVENT(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int price = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		if(num<=4) {
			arr.add(price);
		}
		else if(num<10 && num>=5) {
			arr.add(price-500);
		}else if(num<15 && num>=10) {
			arr.add(price-500);
			arr.add(price*90/100);
		}else if(num<20 && num>=15) {
			arr.add(price-500);
			arr.add(price*90/100);
			arr.add(price-2000);
		}else if(num>=20) {
			arr.add(price-500);
			arr.add(price*90/100);
			arr.add(price-2000);
			arr.add(price*75/100);
		}
		
		arr.sort(Comparator.naturalOrder());
		if(arr.get(0)<=0)
		{
			System.out.println(0);
		}else {
			System.out.println(arr.get(0));
		}
		
	}

}
