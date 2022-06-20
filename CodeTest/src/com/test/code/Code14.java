package com.test.code;

import java.util.Scanner;

public class Code14 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[cnt] = i;
				cnt++;
			}
		}
		for(int i:idx) {
			if(i==0) break;
			System.out.print(i+" ");
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수는 몇개입니까? : ");
		int n = sc.nextInt();
		int []idx = new int [n];
		int[]a = new int [n];
		for(int i = 0; i<n; i++) {
			System.out.print(i+" : ");
			a[i] = sc.nextInt();
		}
		System.out.print("키 값은? ");
		int key = sc.nextInt();
		
		System.out.println(searchIdx(a , n , key , idx )+"개");
	}

}
