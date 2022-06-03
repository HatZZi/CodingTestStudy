package com.test.code;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		for(int i = 0; i<n/w; i++) {
			System.out.println("*".repeat(w));
		}
		int rest = n%w;
		if(rest !=0) {
			System.out.println("*".repeat(rest));
		}

	}

}
