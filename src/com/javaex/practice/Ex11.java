package com.javaex.practice;
/*[Ex11.java]
두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
*/

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int val, rem;
		if (num1 > num2) {
			val = num1 / num2;
			rem = num1 % num2;			
		} else {			
			val = num2 / num1;
			rem = num2 % num1;			
		}
		
		System.out.println("몫: " + val);
		System.out.println("나머지: " + rem);
		
		sc.close();
	}
}
