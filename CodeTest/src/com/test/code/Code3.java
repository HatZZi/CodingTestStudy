package com.test.code;
import java.util.*;

public class Code3 {

	static int sumOf(int a, int b) {
		int min = 0;
		int max = 0;
		int sum = 0;
		
		if(a>b) {
			min = b;
			max = a;
		}else {
			min = a;
			max = b;
		}
		
		for(int i=min; i<=max; i++) {
			sum+=i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("두 수의 합계는 "+sumOf(a,b)+"입니다.");
	}

}
