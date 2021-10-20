package baitap;

import java.util.Scanner;
import java.math.*;
import java.math.*;
public class thuchanh {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = Integer.parseInt(in.nextLine());
		while(m>0) {
			long n = Long.parseLong(in.nextLine());
			long x = (long)Math.sqrt(n);
			double y = Math.pow(x, 2);
			if(n*1.0 == y) {
				System.out.println("YES");
			}else System.out.println("NO");
			m--;
		}
		
	}
}
