package com.test.code;
import java.util.*;
public class Code4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a값: ");
		int a = sc.nextInt();
		int b = 0;
		do {
			System.out.print("b값: ");
			b = sc.nextInt();
			if(a>b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		}while(a > b);
		
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}

}
