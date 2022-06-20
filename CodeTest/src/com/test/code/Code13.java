package com.test.code;

import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int[]a = {6,4,3,2,1,9,8};
		
		System.out.print("    | ");
		for(int i=0; i<=6; i++) {
			System.out.print(" "+i+" ");
		}
		System.out.println("\n----+------------------------");
		for(int i=0; i<=6; i++) {
			System.out.print("    | ");
			for(int j=0; j<i; j++) {
				System.out.print("   ");
			}
			System.out.print("*");
			System.out.print("\n  "+i+" |");
			for(int k=0; k<=6; k++) {
				System.out.print(" "+a[k]+" ");
			}
			System.out.println();
			if(a[i]==key) {
				System.out.println("그 값은 x["+i+"]에 있습니다.");
				break;
			}
			System.out.println("    |");
			
		}
	}

}
