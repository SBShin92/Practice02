package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		String str = new String();
		boolean bool = true;
		float f = 3.14F;
		
		switch (f) {
		case 3.14F: {
			System.out.println();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + str);
		}			
	}

}
/*
[Ex02.java]
다음 중 switch 문에서 조건식에 넣을 수 있는 데이터 타입은?
(1) boolean
(2) char
(3) byte
(4) short
(5) int
(6) long
(7) float
(8) double
(9) String

정답:

전부 다~ 올 수 있다.


*/