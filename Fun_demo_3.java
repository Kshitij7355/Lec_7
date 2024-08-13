package lec7;
import java.util.*;
public class Fun_demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int ans = Add(a,b);
		System.out.println(ans);
	}
	public static int Add(int a,int b) {
		int c = a+b;
		System.out.println(Sub(c,a));
		return c;

	}
	public static int Sub(int a,int b) {
		return a-b;
	}
     
}
