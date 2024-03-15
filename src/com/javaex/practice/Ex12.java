package com.javaex.practice;

import java.util.Scanner;

/*[Ex12.java]
숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
*/

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자: ");
		int num3 = sc.nextInt();
		int min = 0;
		
		if (num1 >= num2) {
			if (num1 > num3 && num2 > num3)
				min = num3;
			else
				min = num2;
		} else if (num2 >= num3) {
			if (num3 > num1 && num2 > num1)
				min = num1;
			else
				min = num3;	
		} else if (num3 >= num1) {
			if (num3 > num2 && num1 > num2)
				min = num2;
			else
				min = num1;				
		}
		
		System.out.println("가장 작은 수는 " + min + " 입니다.");
		
		
		sc.close();
	}
}
