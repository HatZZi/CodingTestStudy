package com.test.code;

import java.util.Arrays;

public class Code10 {
	
	static void swap(int[]a,int n1, int n2) {
		int t = a[n2];
		a[n2] = a[n1];
		a[n1] = t;
	}
	
	static int sumOf(int[]a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static void copy(int[]a, int[]b) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
	}
	
	static void rcopy(int[]a, int[]b) {
		for(int i=0; i<=a.length-1; i++) {
			b[i] = a[a.length-1-i];
		}
	}
	
	public static void main(String[] args) {
		int[]a = {2,5,1,3,9,6,7};
		String a2 = Arrays.toString(a);
		System.out.println(a2);
		System.out.println("a[0]과 a[6]을 교환합니다.");
		swap(a,0,6);
		a2 = Arrays.toString(a);
		System.out.println(a2);
		System.out.println("a[1]과 a[5]을 교환합니다.");
		swap(a,1,5);
		a2 = Arrays.toString(a);
		System.out.println(a2);
		System.out.println("a[2]과 a[4]을 교환합니다.");
		swap(a,2,4);
		a2 = Arrays.toString(a);
		System.out.println(a2);
		
		
		System.out.println("배열의 모든 요소의 합은 "+sumOf(a)+"입니다.");
		
		
		int[]b = new int[a.length];
		copy(a, b);
		System.out.printf("a배열을 b배열에 복사하였습니다. b:");
		System.out.printf(Arrays.toString(b));
		System.out.println();
		
		rcopy(a, b);
		System.out.printf("a배열을 b배열에 역순으로 복사하였습니다. b:");
		System.out.println(Arrays.toString(b));

	}

}
