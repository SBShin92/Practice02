package com.javaex.practice;

import java.util.Scanner;

/* [Ex10.java]
두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
*/

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		if (num1 >= num2)
			System.out.println("큰수: " + num1 + "\t작은수: " + num2 + "입니다.");			
		else
			System.out.println("큰수: " + num2 + "\t작은수: " + num1 + "입니다.");
		
		sc.close();
		
	}
}
