package Lec7;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			
		}
		int k =s.nextInt();
		Rotate(arr,k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Rotate(int[]arr ,int k) {
		
		int n=arr.length;
		k = k%n;
		for(int i=0;i<k;i++) {
			int last_ele=arr[n-1];
			for(int j=n-2;j>=0;j--) {
				arr[j+1]=arr[j];
			}
			arr[0]=last_ele;
		}
		 
	}

}
