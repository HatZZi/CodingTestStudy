package com.test.code;
import java.util.*;

public class Code2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int n = sc.nextInt();
		
		int sum = (1+n)*(n/2);
		System.out.println("1부터 "+n+"까지의 정수 합은 "+sum+"입니다.");

	}

}
