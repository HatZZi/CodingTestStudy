package com.test.code;

import java.util.Scanner;

public class Code9 {
	static void spire(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(' ');				
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=(n-i); j++) {
				System.out.print(' ');				
			}
			System.out.println();
		}
	}
	static void npire(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(' ');				
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print(i);
			}
			for(int j=1; j<=(n-i); j++) {
				System.out.print(' ');				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		spire(n);
		npire(n);
	}

}
