package Lec7;

import java.util.Scanner;

public class Rotate_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int k= s.nextInt();
		Rotate(arr,k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Rotate(int[]arr, int k) {
	    int n=arr.length;
	    k=k%n;
	    Reverse(arr,n-k,n-1);
	    Reverse(arr,0,n-k-1);
		Reverse(arr,0,n-1);
	}
	public static void Reverse(int[]arr,int i ,int j) {
		while(i<j) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
