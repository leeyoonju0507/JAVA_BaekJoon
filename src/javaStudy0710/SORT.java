package javaStudy0710;


import java.util.Arrays;
import java.util.Scanner;

public class SORT {

	public static void printSORT(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0;i<3;i++)
		{
			arr[i] = scan.nextInt(); 
		}
		Arrays.sort(arr);
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
