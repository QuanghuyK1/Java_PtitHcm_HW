package baitap;

import java.util.Scanner;
import java.math.*;
public class thuchanh {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		while(n>0) {
			String s = in.nextLine();
			boolean tam = true;
			for(int i=0;i<s.length()-1;i++) {
				int a = (int)s.charAt(i)-(int)s.charAt(i+1);
				if(Math.abs(a)!=1) {
					tam = false;
					break;
				}
			}
			if(tam == true) {
				System.out.println("YES");
			}else System.out.println("NO");
			n--;
		}
	}
}
