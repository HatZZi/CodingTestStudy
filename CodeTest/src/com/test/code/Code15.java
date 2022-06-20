package com.test.code;

import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소는 몇개입니까? ");
		int num = sc.nextInt();
		int[]a = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("\n"+ i +" : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("찾는 수는 몇입니까? ");
		int key = sc.nextInt();
		
		System.out.print("   |");
		for(int i=0; i<num; i++) {
			System.out.print(" "+i);
		}
		System.out.println("\n---+----------------");
		
		int pl = 0;
		int pr = num-1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc]==key) {
				
			}
		}while(pl<=pr);
	}

}
