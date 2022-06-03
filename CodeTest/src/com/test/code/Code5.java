package com.test.code;
import java.util.*;
public class Code5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		int cnt = 1;
		int pos = 10;
		while(true) {
			if(num/pos==0) {
				System.out.println(num+"은 "+cnt+"자리 숫자입니다.");
				break;
			}else {
				pos = pos*10;
				cnt++;
			}
		}
	}
}
