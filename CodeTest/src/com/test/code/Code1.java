package com.test.code;

public class Code1 {

	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}
	}

	static int med4(int a, int b, int c) {
		if((b>=a && c<=a)||(b<=a && c>=a)) {
			return a;
		}else if((a>b && c<b)||(a<b && b>c)) {
			return b;
		}else {
			return c;
		}
	}

	public static void main(String[] args) {

	}

}
