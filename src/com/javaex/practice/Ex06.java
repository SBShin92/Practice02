package com.javaex.practice;

import java.util.Scanner;

/*
 * [Ex06.java]
나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
작성하세요.
 */

/* 답안 코드 */
public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요\n나이: ");
		int num = sc.nextInt();
		
		if (num >= 19 && num < 65)
			System.out.println("1번그룹 입니다.");
		else
			System.out.println("2번그룹 입니다.");
		
		
		sc.close();
	}
}
