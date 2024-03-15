package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자: ");
		int num3 = sc.nextInt();
		int max = 0;
		
		if (num1 >= num2) {
			if (num3 > num2 && num3 > num1)
				max = num3;
			else
				max = num1;
		} else if (num2 >= num3) {
			if (num1 > num3 && num1 > num2)
				max = num1;
			else
				max = num2;	
		} else if (num3 >= num1) {
			if (num2 > num1 && num2 > num3)
				max = num2;
			else
				max = num3;				
		}
		
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		
		
		sc.close();
	}
}
