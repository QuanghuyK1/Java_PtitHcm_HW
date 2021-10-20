package baitap;

import java.util.Scanner;
import java.math.*;
public class thuchanh {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		while(n>0) {
			String s = in.nextLine();
			String s1[] = s.split(" ");
			String s3 ="";
			for(int i=0;i<s1.length;i++) {
				String s2 = new StringBuffer(s1[i]).reverse().toString();
				s3 = s3 + s2 +" ";
			}
			s3 = s3.trim();
			System.out.println(s3);
			n--;
		}
	}
}
