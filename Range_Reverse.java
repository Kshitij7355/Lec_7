package Lec7;

import java.util.Scanner;

public class Range_Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int i=s.nextInt();
		int j=s.nextInt();
		Reverse(arr,i,j);
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		

	}
	public static void Reverse(int[]arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
	}

}
